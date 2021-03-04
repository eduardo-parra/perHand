package yatzy;

public class ResultGenerator {
	
	public int getResult(int[] fiveDice, int i) {
		Calc a = new Calc();
		int result = a.sum(fiveDice);
		return result;
	}
}
