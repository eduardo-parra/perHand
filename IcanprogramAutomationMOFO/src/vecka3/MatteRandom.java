package vecka3;

public class MatteRandom {

	public static void main(String[] args) {
		//Skapa en array rand med random nummer 1-100
		int[] random = new int[(int) (Math.random()*100)+1];
		//for loop med random nummer fr�n arrayn
		for(int i =0;i<random.length;i++) {
			//random v�rde (1-100) i arrayn best�ms [i]
			random[i]=(int)(Math.random()*100)+1;
			System.out.println(random[i]);
		}
		
        }

 

}

	


