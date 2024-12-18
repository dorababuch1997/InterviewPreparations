package SampleClass;

public class lagsamnumArray {

	public static void main(String[] args) {
		
		int arr[]= {3,45,56,7,88,9,3,4,78,8,4};
		
		int len = arr.length;
		int temp;
		for(int i=0;i<=len;i++) {
			for(int j=i+1;j<len;j++) {
				
				if(arr[i]>arr[j]) {
					
					temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		int smallestnumber= arr[0];
		int largestnumber = arr[arr.length-1];
		System.out.println(smallestnumber);
		System.out.println(largestnumber);
	}
}
