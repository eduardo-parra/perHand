package yatzy;

public class Dice {
	
	private int face;
public int roll() {//roll �r metoden vi karar p�!
	//l�ngden p� random
	int max=6;
	int min=1;
	int range=max-min+1;
	//den som g�r sifrorna random
	face=(int)(range * Math.random()) + min;
	
	
	return face;
	
	
}

public int getFace() {
	return face;
}
public void setFace(int face) {
	this.face = face;
}
	
	

}

