package yatzy;

public class Calc {
	public int sum (int[] fiveDice) {//metoden sum som �r metoden som r�knar ut sum som r�knar i hop t�rningarna
		int sum =0;                   //h�r ut�kar vi v�ra metoder f�r att r�kna ut sumorna till yatze.
		
		for (int i = 0; i< fiveDice.length;i++)
		{
			sum = sum + fiveDice[i];
		}
		return sum;
	}
}
