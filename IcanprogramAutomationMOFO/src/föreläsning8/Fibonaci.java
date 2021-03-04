package föreläsning8;

import java.util.Scanner;

public class Fibonaci {

	  public static void main(String[] args) {
		 
		  

	       while(true) { 
	    	   System.out.println(">>>>>>pik a fibonacci<<<<");
		  int[] fibonacci = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};

	        Scanner scan = new Scanner(System.in);
	        int number = 1;
	        try {

	        number = Integer.valueOf(scan.nextLine());}
	        catch(Exception e) {
	        	System.out.println("deta är fellet"+e.toString());
	        	System.out.println("plz pik a whole number inte string");
	        }
	        try {
	        System.out.println(fibonacci[number-1]);
	        }catch(Exception e) {
	        	System.out.println("plz pik an number");
	        	System.out.println("deta är fellet"+e.toString());
	        	
	        }


//	        int[] fibonacci2 = new int[10];
//
//	        fibonacci2[0] = 1;
//	        fibonacci2[1] = 1;
//
//	        for(int i=2; i<fibonacci2.length; i++) {
//	            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
//	        }
	        
	        int[] fibonacci2 = new int[10];

	        fibonacci2[0] = 1;
	        fibonacci2[1] = 1;

	        for(int i=2; i<fibonacci2.length; i++) {
	            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
	        }

	        //int number2 = scan.nextInt(); är itne så säker så vill att vi ska använda Integer
int number2=Integer.valueOf(scan.nextLine());
	        System.out.println(fibonacci[number2-1]);}
	  }
	       

}
