package yatzy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Dice myDice = new Dice();

//		System.out.println(myDice.roll());  varför har jag dena ?

		Dice[] fiveDice = new Dice[5];

		for (int i = 0; i < fiveDice.length; i++) {
			fiveDice[i] = new Dice();

		}
		for (int i = 0; i < fiveDice.length; i++) {
			System.out.println("Die numer " + (i + 1) + " is " + fiveDice[i].roll());

		}
		System.out.println("_______________________________________");
		int reroll;
		int x=1;
		while (x<3) {
			System.out.println("Hur många träningar vill du byta?");
			reroll = scan.nextInt();
			switch (reroll) {
			case 0:
				System.out.println("______________New_Round____________");
				break;
			case 1:
				System.out.println("Vilken tärning vill du byta");
				int change = scan.nextInt();
				if (change == 1) {
					System.out.println("Ny Tärning " + fiveDice[0].roll());
				

				}
				if (change == 2) {
					System.out.println("Ny Tärning " + fiveDice[1].roll());

				}
				if (change == 3) {
					System.out.println("Ny Tärning " + fiveDice[2].roll());

				}
				if (change == 4) {
					System.out.println("Ny Tärning " + fiveDice[3].roll());

				}
				if (change == 5) {
					System.out.println("Ny Tärning " + fiveDice[4].roll());
				}
				for (int i = 0; i < fiveDice.length; i++) {
					System.out.println("Die numer " + (i + 1) + " is " + fiveDice[i].getFace());}
				x++;
				break;

			case 2:
				System.out.println("Vilka tärning vill du byta");
				change = scan.nextInt();
				if (change == 1) {
					System.out.println("Ny Tärning " + fiveDice[0].roll());}
				if (change == 2) {
					System.out.println("Ny Tärning " + fiveDice[1].roll());}
				if (change == 3) {
					System.out.println("Ny Tärning " + fiveDice[2].roll());}
				if (change == 4) {
					System.out.println("Ny Tärning " + fiveDice[3].roll());}
				if (change == 4) {
					System.out.println("Ny Tärning " + fiveDice[4].roll());}
				System.out.println("Vill ken är den andra tärningen");
				change = scan.nextInt();
				if (change == 1) {
					System.out.println("Ny Tärning " + fiveDice[0].roll());}
				if (change == 2) {
					System.out.println("Ny Tärning " + fiveDice[1].roll());}
				if (change == 3) {
					System.out.println("Ny Tärning " + fiveDice[2].roll());}
				if (change == 4) {
					System.out.println("Ny Tärning " + fiveDice[3].roll());}
				if (change == 4) {
					System.out.println("Ny Tärning " + fiveDice[4].roll());}
				for (int i = 0; i < fiveDice.length; i++) {
					System.out.println("Die numer " + (i + 1) + " is " + fiveDice[i].getFace());
					}
				x++;
				
				break;
			case 3:
				System.out.println("Vilka tärning vill du byta");
				change = scan.nextInt();
				if (change == 1) {
					System.out.println("Ny Tärning " + fiveDice[0].roll());}
				if (change == 2) {
					System.out.println("Ny Tärning " + fiveDice[1].roll());}
				if (change == 3) {
					System.out.println("Ny Tärning " + fiveDice[2].roll());}
				if (change == 4) {
					System.out.println("Ny Tärning " + fiveDice[3].roll());}
				if (change == 4) {
					System.out.println("Ny Tärning " + fiveDice[4].roll());}
				System.out.println("Vilken är den andra tärningen");
				change = scan.nextInt();
				if (change == 1) {
					System.out.println("Ny Tärning " + fiveDice[0].roll());}
				if (change == 2) {
					System.out.println("Ny Tärning " + fiveDice[1].roll());}
				if (change == 3) {
					System.out.println("Ny Tärning " + fiveDice[2].roll());}
				if (change == 4) {
					System.out.println("Ny Tärning " + fiveDice[3].roll());}
				if (change == 4) {
					System.out.println("Ny Tärning " + fiveDice[4].roll());}
				System.out.println("Vill ken är den trejde tärningen");
				change = scan.nextInt();
				if (change == 1) {
					System.out.println("Ny Tärning " + fiveDice[0].roll());}
				if (change == 2) {
					System.out.println("Ny Tärning " + fiveDice[1].roll());}
				if (change == 3) {
					System.out.println("Ny Tärning " + fiveDice[2].roll());}
				if (change == 4) {
					System.out.println("Ny Tärning " + fiveDice[3].roll());}
				if (change == 4) {
					System.out.println("Ny Tärning " + fiveDice[4].roll());}
				for (int i = 0; i < fiveDice.length; i++) {
					System.out.println("Die numer " + (i + 1) + " is " + fiveDice[i].getFace());
					}
				x++;
				break;
			case 4:
				System.out.println("Vilka tärning vill du byta");
				change = scan.nextInt();
				if (change == 1) {
					System.out.println("Ny Tärning " + fiveDice[0].roll());}
				if (change == 2) {
					System.out.println("Ny Tärning " + fiveDice[1].roll());}
				if (change == 3) {
					System.out.println("Ny Tärning " + fiveDice[2].roll());}
				if (change == 4) {
					System.out.println("Ny Tärning " + fiveDice[3].roll());}
				if (change == 4) {
					System.out.println("Ny Tärning " + fiveDice[4].roll());}
				System.out.println("Vilken är den andra tärningen");
				change = scan.nextInt();
				if (change == 1) {
					System.out.println("Ny Tärning " + fiveDice[0].roll());}
				if (change == 2) {
					System.out.println("Ny Tärning " + fiveDice[1].roll());}
				if (change == 3) {
					System.out.println("Ny Tärning " + fiveDice[2].roll());}
				if (change == 4) {
					System.out.println("Ny Tärning " + fiveDice[3].roll());}
				if (change == 4) {
					System.out.println("Ny Tärning " + fiveDice[4].roll());}
				System.out.println("Vill ken är den trejde tärningen");
				change = scan.nextInt();
				if (change == 1) {
					System.out.println("Ny Tärning " + fiveDice[0].roll());}
				if (change == 2) {
					System.out.println("Ny Tärning " + fiveDice[1].roll());}
				if (change == 3) {
					System.out.println("Ny Tärning " + fiveDice[2].roll());}
				if (change == 4) {
					System.out.println("Ny Tärning " + fiveDice[3].roll());}
				if (change == 4) {
					System.out.println("Ny Tärning " + fiveDice[4].roll());}
				System.out.println("Vill ken är den Fjärde tärningen");
				change = scan.nextInt();
				if (change == 1) {
					System.out.println("Ny Tärning " + fiveDice[0].roll());}
				if (change == 2) {
					System.out.println("Ny Tärning " + fiveDice[1].roll());}
				if (change == 3) {
					System.out.println("Ny Tärning " + fiveDice[2].roll());}
				if (change == 4) {
					System.out.println("Ny Tärning " + fiveDice[3].roll());}
				if (change == 4) {
					System.out.println("Ny Tärning " + fiveDice[4].roll());}
				for (int i = 0; i < fiveDice.length; i++) {
					System.out.println("Die numer " + (i + 1) + " is " + fiveDice[i].getFace());
					}
				x++;
				break;
			case 5:
				System.out.println("Dina nya Dies");
				for (int i = 0; i < fiveDice.length; i++) {
					fiveDice[i].roll();}
				
				for (int i = 0; i < fiveDice.length; i++) {
					System.out.println("Die numer " + (i + 1) + " is " + fiveDice[i].getFace());}

			
				break;

			case 6:
				x = 3;
				break;

			}
			
			int[] rolls = new int[5];
			for(int i = 0; i < fiveDice.length; i++) {
				rolls[i] = fiveDice[i].getFace();
			}
			Calc a = new Calc();
			int result = a.sum(rolls);
			System.out.println("Total summa "+result);
		}
	}



}
