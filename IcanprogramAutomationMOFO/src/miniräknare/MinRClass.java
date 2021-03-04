package miniräknare;

import java.util.Scanner;

public class MinRClass {

	public static int calcMenu() {
	
		System.out.println("Plz pick nummber 1-5");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("1.addera " + "2.subtrahera " + "3.multiplicera " + "4.dividera" + " 5.Avsluta");
		System.out.println("----------------------------------------------------------------------------------");
		Scanner val = new Scanner(System.in);
		int A = val.nextInt();
		return A;
	}

	// Skriv nummer
	public static void addNum() {

		System.out.println("skriv nummer");

	}

	public static void addNum2() {

		System.out.println("skriv nytt nummer");

	}

	public static double addera() {
		double x, y, sum;
		Scanner myObj = new Scanner(System.in);
		MinRClass.addNum();
		x = myObj.nextDouble();
		MinRClass.addNum2();
		y = myObj.nextDouble();

		sum = x + y;
		System.out.println("suman är " + sum);
		return sum;
	}
	
	public static double subtrahera() {
		double x, y, sum;
		Scanner myObj= new Scanner(System.in);
		MinRClass.addNum();
		x = myObj.nextInt();
		
		MinRClass.addNum2();
		y = myObj.nextInt();
		
		sum = x-y;
		System.out.println("suman är " + sum);
		return sum;
	}
	public static double multiplicera() {
		double x, y, sum;
		Scanner myObj= new Scanner(System.in);
		MinRClass.addNum();
		x = myObj.nextInt();
		
		MinRClass.addNum2();
		y = myObj.nextInt();
		
		sum = x*y;
		System.out.println("suman är " + sum);
		return sum;}
	public static double dividera() {
		double x, y, sum;
		Scanner myObj= new Scanner(System.in);
		MinRClass.addNum();
		x = myObj.nextInt();
		
		MinRClass.addNum2();
		y = myObj.nextInt();
		
		sum = x/y;
		System.out.println("suman är " + sum);
		return sum;}
	
	

}

//skapa en 