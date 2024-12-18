package SampleClass;

public class EachWorldRev {
	
	public static void main(String[] args) {
		
		
		String input = "how are you";
		
		String[] split = input.split("\\s");
		
		String rev="";
		
		String result ="";
		
		for (String string : split) {
			
			char[] charArray = string.toCharArray();
			
			for(int i =charArray.length-1;i>=0;i--) {
				rev= rev+charArray[i];
			}
			result = result+rev+" ";
		}
		System.out.println(result);
	}

}
