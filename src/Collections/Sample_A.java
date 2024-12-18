package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;
import java.util.Vector;

public class Sample_A {
	
	public static void main(String[] args) {
		

		String str = "i like automation";
		
		String trim = str.trim();
		
		String replace = trim.replace(" ", "");		
		System.out.println(replace);
		
		Vector<String> vector = new Vector<String>();
		
		ArrayList<String> arraylist = new ArrayList<String>();
		
		vector.add("Dorababu");
		vector.add("Chodavarapu");
		vector.add("Nagarro");
		
		System.out.println(vector);
	
		arraylist.addAll(vector);
		
		System.out.println(arraylist);
		
	}

}
