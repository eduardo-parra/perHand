package PetZoo;

public class PetZoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet parrot = new Pet();
		parrot.setName("Arne");
		
		Pet rat = new Pet();
		rat.setName("Kurt");

		System.out.println("The parrot's name is " + parrot.getName());
		System.out.println("The rat's name is " + rat.getName());

	}

}
