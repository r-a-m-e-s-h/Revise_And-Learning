package javaPrograms_R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class practise_R {
	
	
	
	
	
	public static void main(String[] args)
	{
		/*
		String txt = "Hello";
		String rev="";
		char[] ca = txt.toCharArray();
		
		for(int i=ca.length-1;i>=0;i--)
		{
			rev=rev+ca[i];
		}
		System.out.println(rev);
		*/
		
		/*
		String txt ="qwerty";
		StringBuilder builder = new StringBuilder();
		builder.append(txt);
		System.out.println("This is String Builder Reverse : "+builder.reverse());
		
		StringBuffer buffer = new StringBuffer();
		buffer.append(txt);
		System.out.println("This is String buffer Reverse : "+buffer.reverse());
		*/
		/*
		String txt = "Sivam";
		char[] ca = txt.toCharArray();
		
		List<Character> list = new ArrayList<>();
		for (Character character : ca) {
			list.add(character);
			
		}
		Collections.reverse(list);
		ListIterator iterator = list.listIterator();
		while(iterator.hasNext())
		{
			 System.out.println(iterator.next());
		}
		
		 */
		
		String txt = "r a m e s h ";
	       
        char[] ca = txt.toCharArray();
       List<Character> list = new ArrayList<Character>();
       for(Character character : ca)
       {
           list.add(character);
       }
       Collections.reverse(list);
       ListIterator iterator = list.listIterator();
       while(iterator.hasNext())
       {
           System.out.println(iterator.next());
       }
	}

}
