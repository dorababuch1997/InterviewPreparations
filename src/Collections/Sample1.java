package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sample1 {
	
	
	
	
	public static void main(String[] args) {
		
		String str= "ABCD86501ae";
		
		String ouput="BCD8650";  // aeiou
		
			
		StringBuffer aplf = new StringBuffer();
		StringBuffer num= new StringBuffer();
		
		char[] charArray = str.toCharArray();
		
		for (char c : charArray) {
			
			if (Character.isUpperCase(c)) {
				
				if(c!='A'||c!='E'||c!='I'||c!='O'||c!='U') {
					
					aplf.append(c);
				}
				
			
			}else if (Character.isDigit(c)) {
				
				num.append(c);
				
			}
			
		}
		
		System.out.println(aplf.toString()+num.toString());

			String substring = str.substring(1,8);
			
			System.out.println(substring);
	}
	
	
	
	
	
	public static void CompanyNamexpath(String companyname) {
		
		
		String xpath ="//span[text()='+companyname+']//following::td[1]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
