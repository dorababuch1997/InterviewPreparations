package SampleClass;

public class checkStringpalidrome {
	
	
	public static void main(String[] args) {
		
		String input = "nitin";
		
		String rev = "" ;
		char[] c = input.toCharArray();
		
		for(int i =c.length-1;i>=0;i--) {
			
			rev = rev+c[i];
			
		}
		
		System.out.println(rev);
		if (rev.equals(input)) {
			
			System.out.println("world is palidrome");
		}
	}

}
