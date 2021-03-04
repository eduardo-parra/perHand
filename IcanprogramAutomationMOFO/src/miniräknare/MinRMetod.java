package miniräknare;

import java.util.Scanner;

public class MinRMetod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i=0;
		while (i ==0) {
			int A=MinRClass.calcMenu();	
			
			if (A == 1) {
				MinRClass.addera();

			}
			else if(A==2) {
				MinRClass.subtrahera();
				
			}
			else if(A==3) {
				MinRClass.multiplicera();
				
			}
			else if(A==4) {
				MinRClass.dividera();
			}
			else if(A==5) {
				i++;
				System.out.println("BYE!!!");
				
			}
			else {
				System.out.println("var snäl och välje menal 1-5");
				
			}

		}
	}
}
