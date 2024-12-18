package pdf;

public class P1 {
	
	public static void main(String[] args) {
	
		int arr[]= {2,34,343,45,67,89,89,34,2,90,91,99,90};
		
		int len = arr.length;
		int temp;
			
		for(int i =0;i<len;i++) {
			
			for(int j=i+1;j<len;j++) {
				
				if(arr[i]>arr[j]) {
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		int j=1;
		
		for(int i =0;i<len-1;i++) {
			
			if(arr[i]!=arr[i+1]) {
				
				arr[j++]=arr[i+1];
			}
		}
		
		for(int k=0;k<j;k++) {
			
			System.out.println(arr[k]);
		}
		
		
}
}