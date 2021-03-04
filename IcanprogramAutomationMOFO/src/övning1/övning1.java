package övning1;
import java.util.Scanner;
public class övning1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*int kr,dollar,pund;
		Scanner myKr= new Scanner(System.in);
		System.out.println("hur många KR har du manen");
		kr = myKr.nextInt();
		
		dollar=kr/8;
		pund=kr/11;
		System.out.println("dina kr är värda "+dollar+" dollar " + pund+" i pund");
*/
		
		Scanner scan= new Scanner(System.in);
		System.out.println("plz input temperatur in F.");
		int temp= scan.nextInt();
		double out=(temp - 32)/1.8;
		System.out.println(out +" this is your temp in C");
		System.out.println("okease input temp in C");
		int tempc = scan.nextInt();
		double out2 = tempc*1.8+32;
		System.out.println(out2 +" this is your temp in F");
	}

}
