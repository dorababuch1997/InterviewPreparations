package SampleClass;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeduplicatesinstring {
	
	public static void main(String[] args) {
		
		
		String name = "my is name is dorababu dorababu";
		
		String[] split = name.split(" ");
		
		Set<String> hashSet = new LinkedHashSet<String>();
		
		for (String s : split) {
			
			hashSet.add(s);
		}
		
	
		Iterator iterator = hashSet.iterator();
		String rev="";
		while(iterator.hasNext()) {
		//	System.out.println(iterator.next()+" ");
			rev= rev+iterator.next()+" ";
		}
		System.out.println(rev);
	}

}
