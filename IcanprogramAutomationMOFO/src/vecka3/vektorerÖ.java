package vecka3;

import java.util.Scanner;

public class vektorer÷ {
	public static void main(String[] args) {
//	String[] best= {"EP","stuveson","Johannes","mammamia","tolina"};
//	
//	System.out.println(best[0]);
//	System.out.println(best[4]);
		
		Scanner scan = new Scanner(System.in);
		String[] names= new String[5];
		
		for(int i = 0; i<5; i++) {
			System.out.println("enter the name of the dead!!! "+ (i+1)+":");
			names[i]=scan.nextLine();
		
		
		}
		
		System.out.println("namnet ‰r "+names[0]+".");
		System.out.println("namnet ‰r "+names[4]+".");
	
		System.out.println("l‰ngden opÂ din aray ‰r "+names[ names.length-1]);
		
		}
	
	
}
	
