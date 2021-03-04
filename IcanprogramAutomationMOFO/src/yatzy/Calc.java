package yatzy;

public class Calc {
	public int sum (int[] fiveDice) {//metoden sum som är metoden som räknar ut sum som räknar i hop tärningarna
		int sum =0;                   //här utökar vi våra metoder för att räkna ut sumorna till yatze.
		
		for (int i = 0; i< fiveDice.length;i++)
		{
			sum = sum + fiveDice[i];
		}
		return sum;
	}
}
