package com.sodexo;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int count = 0;
		for(int i=2;i<num/2;i++) {
			
			if(num%i==0) {
				count =0;
			}else {
				count =1;
			}
		}
		
		if(count==1) {
			System.out.println("Prime Number");
		}
		
		
		
		
	}
}
