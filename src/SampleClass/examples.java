package SampleClass;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class examples {

	public static void main(String[] args) {

		
		int input =153;
		
		int i=0,j=0,a;
		
		a=input;
		
		while(a>0) {
			
			
			i = a%10;
			j=j+(i*i*i);
			a=a/10;
			
		}
		
		System.out.println(j);

	}
}
	
	
	
		

