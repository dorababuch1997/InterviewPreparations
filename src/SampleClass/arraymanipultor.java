package SampleClass;


public class arraymanipultor {
	
	public static void main(String[] args) {
		
		int input[]= {2,7,11,15};
		int target = 4;
		int len = input.length;
		int count =0;
		int i ,j;
		for( i =0;i<len;i++) {
			for( j =i+1;j<len;j++) {
				count = input[i]+input[j];		
				if(count ==target) {		
					System.out.println(i);
					System.out.println(j);
				}else {
					System.out.println("target is not existing");
				}
			}
		}
		
	}
}
