import java.util.ArrayList;

public class testes {
    public static void main(String[] args) {
        
        DaoPet daoPet = new DaoPet();


        // Pet pet = new Pet();
        // pet.setNome("Bob");
        // pet.setIdade(12);
        // pet.setTipo("Cachorro");
        // pet.setPeso(5.72);
        // pet.setCor("Branco / marrom");
        // daoPet.inserir(pet);

        ArrayList<Pet> pets = daoPet.findAll();

        for (Pet pet : pets) {
            System.out.println("=========");
            daoPet.listPet(pet);
        }



    }
}
