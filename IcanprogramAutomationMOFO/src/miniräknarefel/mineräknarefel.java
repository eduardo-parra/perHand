package miniräknarefel;
import java.util.Scanner;
public class mineräknarefel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
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
		}
		
	} catch(Exception e) { System.out.println(" do it agen!!!! mofo");
	
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
}
		} 
	}

		
}	
			
			
