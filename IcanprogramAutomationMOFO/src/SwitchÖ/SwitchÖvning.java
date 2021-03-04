package Switch÷;

import java.util.Scanner;

public class Switch÷vning {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Plz pick a Simpsons!");
	System.out.println("__________________________");
	System.out.println(" 1.Homer\n 2.Marge\n 3.Bart");
	System.out.println("__________________________");
	int Nr;
	Nr=scan.nextInt();
	
	switch(Nr) {
	case 1:
		System.out.println("D'oh!");
		break;
	case 2:
		System.out.println("Mmm~mmmmmmmmmmm");
		break;
	case 3:
		System.out.println("Ay,caramba!");
		break;
	}

	}

}
