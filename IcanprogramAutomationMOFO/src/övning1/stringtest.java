package övning1;

public class stringtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "då";
		StringBuffer buffer = new StringBuffer(text);
		
		buffer.append("!");
		buffer.insert(3,"hej manen");
		buffer.delete(5, 7);
		
		System.out.println(buffer.toString());
	}

}
