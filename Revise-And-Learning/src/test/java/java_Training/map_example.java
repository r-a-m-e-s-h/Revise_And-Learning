package java_Training;

import java.util.HashMap;
import java.util.Map;

public class map_example {
	
	
	
	public static void main(String[] args) {
		
		Map<Integer, String> m = new HashMap<>();
		
		
		m.put(1, "a");
		m.put(2, "b");
		m.put(3, "c");
		System.out.println(m);
		
		System.out.println(m.entrySet());
		
		System.out.println(m.values());
		
		System.out.println(m.keySet());
		
		
		
		
	}

}
