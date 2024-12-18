package rahul;

import java.util.Scanner;

public class checkAmstrong {
	
	private static void revseNum() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i=0,j=0,a;
		a=n;
		while(a>0) {
			i =a%10;
			j=(j*10)+i;
			a=a/10;
		}
		System.out.println(j);
	}	
	//j*10+i
	//j+(i*i*i)
	//j=j+i
	private void printFibonoic() {
		int a =0; int b =1;
		for(int i =1;i<=10;i++) {
			int c = a+b;	
			System.out.println(c);
			a=b;
			b=c;		
		}
	}
	private void findprime() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		for(int i =1;i<n/2;i++) {
			if(n%i==0) {
				count =1;
			}
		}
		if(count==0) {
			System.out.println("prime number");
		}
	}
	private void sumofIn() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i=0,sum=0,a;
		while(n!=0) {
			i =n%10;
			sum =sum+i;
			n=n/10;
		}
		System.out.println(sum);
	}
	//j*10+i
	//j+i*i*
	private static void checkAmsNum() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i=0,j=0;int a;
		a=n;
		while(a>0) {
			i = a%10;
			j= j+(i*i*i);
			a=a/10;
		}
		if(n==j) {
			System.out.println("number is armstrong");
		}
	}
	
	public static void main(String[] args) {		
		checkAmsNum();
		revseNum();
	}
}
