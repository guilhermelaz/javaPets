package view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Pet;

public class PetTableModel extends AbstractTableModel{
    public static final int COL_ID = 0;
    public static final int COL_NOME = 1;
    public static final int COL_IDADE = 2;
    public static final int COL_TIPO = 3;
    public static final int COL_PESO = 4;
    public static final int COL_COR = 5;
    
    public ArrayList<Pet> listaDePets;
    
    public PetTableModel(ArrayList<Pet> pets){
        this.listaDePets = pets;
    }
    
    @Override
    public Object getValueAt(int linha, int coluna){
        Pet pet = listaDePets.get(linha);
        Object content = "";
        
        if (coluna == COL_ID){
            content = pet.getId();
        }
        
        if (coluna == COL_NOME){
            content = pet.getNome();
        }
        
        if (coluna == COL_IDADE){
            content = pet.getIdade();
        }
        
        if (coluna == COL_TIPO){
            content = pet.getTipo();
        }
        
        if (coluna == COL_PESO){
            content = pet.getPeso();
        }
        
        if (coluna == COL_COR){
            content = pet.getCor();
        }
        
        return content;
    }
    
    @Override
    public int getColumnCount(){
        return 6;
    }
       
    @Override
    public int getRowCount(){
        return listaDePets.size();
    }
    
    @Override
    public String getColumnName(int column){
        String name = "";
        
        if (column == COL_ID){name = "id";}
        if (column == COL_NOME){name = "nome";}
        if (column == COL_IDADE){name = "idade";}
        if (column == COL_TIPO){name = "tipo";}
        if (column == COL_PESO){name = "peso";}
        if (column == COL_COR){name = "cor";}
        
        return name;
    }
    
}
