package PetZoo;


//  class
public class PetConstroctor {
// copierad från en anna som ett exempel hur det kan se ut 
 

    // Variables
    private String name;
    private String animal;
    private String fur;
    private int age;

 

    //  Constructor
    private PetConstroctor(String name, String animal) {
        this.name = name;
        this.animal = animal;
    }

 


    public PetConstroctor(String name, String animal, String fur, int age) {
        this.age = age;
        this.fur = fur;
        this.name = name;
        this.animal = animal;
    }

 

    // MAIN METHOD
   public static void main(String[]args) {
        PetConstroctor pet1 = new PetConstroctor("Cthulhu", "Cat");
        PetConstroctor pet2 = new PetConstroctor("Nyarlathotep", "Dog");
        PetConstroctor pet3 = new PetConstroctor("Apocolothoth", "Dog", "Golden", 8);
        pet1.petInfo();
        pet2.petInfo();
        pet3.greaterPetInfo();

 

    }

 

    //Print pet1 and pet2
    private void petInfo() {
        System.out.println("Name: " + name + "," + " Animal: " + animal);
    }

 

    private void greaterPetInfo() {
        System.out.println("Name: " + name + "," + " Animal " + animal + " The fur is " + fur + " Age is:" + age);
    }

 

}

