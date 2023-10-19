package java_Training;

import java.util.ArrayList;
import java.util.List;

public class arrayList_Example {
	
	
	public static void main(String[] args) {
		
		
		List<String> arraylist = new ArrayList<String>();
		
		arraylist.add("helo");
		
		System.out.println(arraylist);
		
		arraylist.add("hello");
		
		arraylist.add("world");
		
		System.out.println(arraylist);
		
		System.out.println("The second is : "+arraylist.get(2));
		
		System.out.println(arraylist.remove(0));
		System.out.println(arraylist);
		
	
		
		
	}

}
