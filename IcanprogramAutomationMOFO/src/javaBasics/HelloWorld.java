package javaBasics;

import java.util.Scanner;

//import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Hellow world!!!!");
		
		//("resource")
		Scanner scan = new Scanner(System.in);
		
		String hej = scan.nextLine();
		System.out.println(hej);
		
		String text = "hej";
		
		System.out.println("Length of text: "+ hej.length());
		System.out.print(text+" då");
		System.out.println("! ");
		System.out.println(text.equals("hej"));
		
		if(text.equals("hallå")){
			System.out.println(text);
			System.out.println("Hurra!!");
			System.out.println("number är nu: ");
			
			
		}
		
	
	
		
	}

}
