package java_Training;

import org.testng.annotations.Test;

public class string_example {
	
	
	
	public static void main(String[] args) {
		
		String name = "Hello";
		
		int number = 2;
		
		System.out.println(" The String methods are below \n");
		
		System.out.println("This is CharAt() example : "+name.charAt(4));
		
		System.out.println("The length() of string is : "+name.length());
		
		System.out.println("This is equals() example : "+name.equals("HELLO"));
		
		System.out.println("This is equlasIgnoreCase() example : "+name.equalsIgnoreCase("hELLO"));
		
		System.out.println("This is conatins() example :"+name.contains("e"));
		
		System.out.println("This is indexof() example : "+name.indexOf("H"));
		
		System.out.println("This is toUpperCase() example : "+name.toUpperCase());
		
		System.out.println("This is toLowerCase() example :  "+name.toLowerCase());
		
		System.out.println("This is substring() example : "+name.substring(1));
		
		String string = new String("  hello World ");
		System.out.println("This is trim() example : "+string.trim());
		
		System.out.println("This is concat() example : "+name.concat(string));
		
		
		
		
		
		
		
		
		
	}

}
