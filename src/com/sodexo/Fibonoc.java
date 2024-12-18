package com.sodexo;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Fibonoc {
	
	
	
	
	public static void main(String[] args) {
		
//		Input: str1 = "{([])}"
//		Input: str2 = "{([])}))))"
				 
		
		String str1 ="{([])}";
		
//		String str2 ="{([])}))))";
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		Stack<Character> stack = new Stack<Character>();
		
//		LinkedList<Character> list = new LinkedList<Character>();
		
		char[] charArray = str1.toCharArray();
		
		for (char c : charArray) {
		
			stack.add(c);
			stack.push(c);
		
		}
		
	}

}
