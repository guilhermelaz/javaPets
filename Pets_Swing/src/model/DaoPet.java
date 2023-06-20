package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoPet {
    
    private Connection conn;
    private Statement st;


    private void conectar() {
        try {
            this.conn = GerenciarConexao.pegarConexao();
            st = conn.createStatement();
        } catch (ClassNotFoundException e1) {
            System.out.println(e1.getMessage());
        } catch (SQLException e2) {
            System.out.println(e2.getMessage());
        }
    }


    private void desconectar() {
        try {
            st.close();
            conn.close();
        } catch (SQLException e2) {
            System.out.println(e2.getMessage());
        }
    }


    public Pet inserir(Pet pet) {

        int petId;

        try {
            this.conectar();
            
            PreparedStatement pst = conn.prepareStatement(
                "INSERT INTO tb_pets (nome, idade, tipo, peso, cor) " +
                "VALUES (?, ?, ?, ?, ?);", Statement.RETURN_GENERATED_KEYS
            );

            pst.setString(1, pet.getNome());
            pst.setInt(2, pet.getIdade());
            pst.setString(3, pet.getTipo());
            pst.setDouble(4, pet.getPeso());
            pst.setString(5, pet.getCor());

            pst.executeUpdate();
            
            ResultSet chaves = pst.getGeneratedKeys();
            chaves.next();
            petId = chaves.getInt(1);
            pet.setId(petId);

        } catch (SQLException sqle) {
            System.out.println("Erro ao inserir Pet no banco de dados: " + sqle.getMessage());
        } finally {
            this.desconectar();;
        }

        // Pet inserido:
        return pet;
    }


    public Pet findOne(int codigo) {

        Pet pet = null;

        try {
            this.conectar();

            ResultSet rs = st.executeQuery("SELECT * FROM tb_pets WHERE id = " + codigo + ";");

            if (rs.next()){
                pet = new Pet();
                pet.setId(rs.getInt("id"));
                pet.setNome(rs.getString("nome"));
                pet.setIdade(rs.getInt("idade"));
                pet.setTipo(rs.getString("tipo"));
                pet.setPeso(rs.getDouble("peso"));
                pet.setCor(rs.getString("cor"));
            }
        } catch (SQLException sqle) {
            System.out.println("Erro na consulta ao banco de dados: " + sqle.getMessage());
        }

        return pet;
    }


    public Pet alterar(Pet pet) {

        try {
            this.conectar();

            PreparedStatement pst = conn.prepareStatement(
                "UPDATE tb_pets SET nome = ?, idade = ?, tipo = ?, peso = ?, cor = ? WHERE id = ?;"
                );

            pst.setString(1, pet.getNome());
            pst.setInt(2, pet.getIdade());
            pst.setString(3, pet.getTipo());
            pst.setDouble(4, pet.getPeso());
            pst.setString(5, pet.getCor());
            pst.setInt(6, pet.getId());

            pst.executeUpdate();

        } catch (SQLException sqle) {
            System.out.println("Erro ao atualizar Pet no banco de dados: " + sqle.getMessage());
        } finally {
            this.desconectar();;
        }

        // Pet atualizado:
        return pet;
    }

    
    public Pet alterar(int id, Pet pet) {

        try {
            this.conectar();

            PreparedStatement pst = conn.prepareStatement(
                "UPDATE tb_pets SET nome = ?, idade = ?, tipo = ?, peso = ?, cor = ? WHERE id = ?;"
                );

            pst.setString(1, pet.getNome());
            pst.setInt(2, pet.getIdade());
            pst.setString(3, pet.getTipo());
            pst.setDouble(4, pet.getPeso());
            pst.setString(5, pet.getCor());
            pst.setInt(6, id);

            pst.executeUpdate();

        } catch (SQLException sqle) {
            System.out.println("Erro ao atualizar Pet no banco de dados: " + sqle.getMessage());
        } finally {
            this.desconectar();
        }

        // Pet atualizado:
        return pet;
    }
    
    public Pet excluir(int codigo) {
        
        Pet petExcluido = this.findOne(codigo);

        try {
            this.conectar();

            PreparedStatement pst = conn.prepareStatement(
                "DELETE FROM tb_pets WHERE id = ?;"
            );
            pst.setInt(1, codigo);
            pst.executeUpdate();
            
            System.out.println("=== PET " + petExcluido.getId() +" excluído! ===\nDados:\n");
            this.listPet(petExcluido);

        } catch (SQLException sqle) {
            System.out.println("Erro ao excluir Pet do banco de dados: " + sqle.getMessage());
        }

        return petExcluido;
    }


    public ArrayList<Pet> findAll() {
        
        ArrayList<Pet> pets = new ArrayList<Pet>();

        try {

            this.conectar();

            ResultSet rs = st.executeQuery("SELECT * FROM tb_pets ORDER BY id;");

            while (rs.next()){
                Pet pet = new Pet();

                pet.setId(rs.getInt("id"));
                pet.setNome(rs.getString("nome"));
                pet.setIdade(rs.getInt("idade"));
                pet.setTipo(rs.getString("tipo"));
                pet.setPeso(rs.getDouble("peso"));
                pet.setCor(rs.getString("cor"));

                pets.add(pet);
            }

        } catch (SQLException sqle) {
            System.out.println("Erro na consulta ao banco de dados: " + sqle.getMessage());
        }

        return pets;

    }
    
    public ArrayList<Pet> pesquisa(String opc, String filtro){
        ArrayList<Pet> resultados = new ArrayList<Pet>();
        
        if(!opc.equals("cor") && !opc.equals("nome") && !opc.equals("tipo")){
            return resultados;
        }
        
        try{
            this.conectar();
            ResultSet rs = st.executeQuery("SELECT * FROM tb_pets WHERE " + opc + " LIKE '%" + filtro + "%';");
            System.out.println(st.toString());
            while(rs.next()){
                Pet pet = new Pet();
                pet.setId(rs.getInt("id"));
                pet.setNome(rs.getString("nome"));
                pet.setTipo(rs.getString("tipo"));
                pet.setIdade(rs.getInt("idade"));
                pet.setPeso(rs.getDouble("peso"));
                pet.setCor(rs.getString("cor"));
                resultados.add(pet);
            }
        } catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        } finally {
            this.desconectar();
        }
        
        for (Pet pet : resultados){
            System.out.println(pet.getNome());
        }
        return resultados;
    }


    public void listPet(Pet pet) {
        System.out.println("Codigo: " + pet.getId());
        System.out.println("Nome: " + pet.getNome());
        System.out.println("Idade: " + pet.getIdade());
        System.out.println("Tipo: " + pet.getTipo());
        System.out.println("Peso: " + pet.getPeso());
        System.out.println("Cor: " + pet.getCor());
    }

}

