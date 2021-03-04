package miniräknare1;
import java.util.Scanner;
public class MinereknareWileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 1;
		while(A!=5) {
			
			
			System.out.println("Plz pick nummber 1-5");
			System.out.println("1.addera "+ "2.subtrahera "+ "3.multiplicera "+"4.dividera" +" 5.Avsluta");
			Scanner val = new Scanner(System.in);
			A=val.nextInt();
			if (A == 1) 
			{int x,y,sum;
			Scanner myobj= new Scanner(System.in);
			System.out.println("skriv nummer");
			x = myobj.nextInt();
			
			System.out.println("andra nummret");
			y = myobj.nextInt();
			
			sum = x+y;
			System.out.println("suman är " + sum);}
			
			else if(A==2) {int x,y,sum;
			Scanner myobj= new Scanner(System.in);
			System.out.println("skriv nummer");
			x = myobj.nextInt();
			
			System.out.println("andra nummret");
			y = myobj.nextInt();
			
			sum = x-y;
			System.out.println("suman är " + sum);
				}
			else if(A==3) {int x,y,sum;
			Scanner myobj= new Scanner(System.in);
			System.out.println("skriv nummer");
			x = myobj.nextInt();
			
			System.out.println("andra nummret");
			y = myobj.nextInt();
			
			sum = x*y;
			System.out.println("suman är " + sum);
				}
			else if(A==4) {int x,y,sum;
			Scanner myobj= new Scanner(System.in);
			System.out.println("skriv nummer");
			x = myobj.nextInt();
			
			System.out.println("andra nummret");
			y = myobj.nextInt();
			
			sum = x/y;
			System.out.println("suman är " + sum);
				}
			
			else if(A==5) {
			A=5;
			System.out.println("BYE!!!");
			
				}
			
			else {
				System.out.println("var snäl och välje menal 1-5");
			}
			
			
		}

			
			
		}
		
	}
	


