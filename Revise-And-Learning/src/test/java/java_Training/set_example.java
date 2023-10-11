package java_Training;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class set_example {
	
	public static void main(String[] args) {
		
		
		Set<String> set = new HashSet<String>();
		
		set.add("a");
		set.add("b");
		set.add("c");
		set.add(null);
		
		System.out.println(set);
		
		TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(1);
		ts.add(9);
		ts.add(3);
		ts.add(-1);
		System.out.println(ts);
		
		
		
		
		
	}
	
	

}
