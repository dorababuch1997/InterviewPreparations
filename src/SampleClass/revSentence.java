package SampleClass;

public class revSentence {
	
	public static void main(String[] args) {
		
		String input = "ASSOCIATE STAFF ENGINER";
		
		
		String[] split = input.split(" ");
		String rev ="";
		
		for(int i =split.length-1;i>=0;i--) {
			
			rev= rev+split[i]+" ";
			
		}
		System.out.println(rev);
		
		

		
		
	}

}
