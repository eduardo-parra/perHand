package föreläsning7;

public class FizzBuzzer {

	public String getValue(int input) {
		
		String s="";
		
		//if(input %5==0 && input % 3==0) { vi använde String s för att säta i hop fizz och buzz
			//return "FizzBuzz";
		//}
	
		if(input%3==0) {
			s+= "Fizz";
		}
		//om input är 5
		//return buzz
		if(input%5==0) {
			s+="Buzz";
		}
		if(s=="") {
			s= Integer.toString(input);
		}
		return s;
	
	
		//return Integer.toString(input);
		//return String.valueOf(input); deta g¨r men läraren vil lanvända den andra 
	}
	

}
