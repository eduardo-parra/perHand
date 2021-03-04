package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class SimpsonsHashMap {

	public static void main(String[] args) {
//		HashMap<String,String> simpsons = new HashMap<>();
//		Scanner scan = new Scanner(System.in);
//		
//		String[] character = {"homer","marge","bart"};
//		String[] phrase = {"D'oh!","Mmm~mmmmmmmmmmm","Ay,caramba!"};
//		
//		for(int i=0;i<character.length;i++) {
//			simpsons.put(character[i],phrase[i]);
//			}System.out.println(simpsons.get("homer"));
//		
		String menu="";
		Scanner scan = new Scanner(System.in);
		HashMap<String,String> simpsons = new HashMap<>();
		boolean validInput;
		String input = "";
		simpsons.put("homer","d'oh!");
		simpsons.put("marge","Mmm~mmmmmmmmmmm");
		simpsons.put("bart","Ay,caramba!");
		
		while (true) {
			validInput = true;
			while(validInput) {
				System.out.println("type homer\n marge\n bart");
				input=scan.nextLine().toLowerCase();
				if(!simpsons.containsKey(input)) {
					System.out.println("Sorry "+ input + " is not valid");
					validInput= true;
				}else {
					validInput = false;
				}
			}
			
		}
		
		
	}

}
