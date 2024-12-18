package SampleClass;

import java.util.HashMap;
import java.util.Scanner;



 class cars{
    
    public int no_of_tires=4;
    public String bodyType ="plastic";
    
    public static void reverseGear(){
        System.out.println("Reverse Gear is Applied");
    }
    
    public static void switchOnHeadlights(){
        System.out.println("Head lights turned on");
    }
}

public class Practices {

	
	public static void main(String[] args) {
	//count	
		int a[]= {34,35,67,89,34,35,2,78,7,9,9,78,67,35};
		
		int n = a.length;
		int temp;
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				
				if(a[i]<a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;			
				}
			}
		}
		
		int temp2[] =new int [n];
		int j1=0;
		for(int i=0;i<n;i++) {
		
			if(a[i]!=a[i+1]) {
				temp[j1++]=a[i];
			}
		
		}
		}
}
