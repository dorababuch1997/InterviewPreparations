package SampleClass;

import java.util.HashSet;

public class duplicatesArray {

	
	
	public static void hastsemethod() {
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		int arr[]= {3,45,56,7,88,9,3,4,78,8,4};
		
		int l = arr.length;
	
		int temp =0;
		
		for(int i =0;i<l;i++) {
			
			for(int j=i+1;j<l;j++) {
				
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i =0;i<l;i++) {		
			for(int j= i+1;j<l;j++) {
				
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
		
		int arr1[]= {3,45,56,7,88,9,3,4,78,8,4};
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		for (int n : arr) {
		
			if(!hashSet.add(n)) {
				System.out.println(n);
			}
		}
	}
}
