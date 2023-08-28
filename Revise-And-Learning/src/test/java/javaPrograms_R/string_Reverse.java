package javaPrograms_R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import org.testng.annotations.Test;

public class string_Reverse {


	public void usingCollections()
	{
		String txt = "World";
		char[] ca = txt.toCharArray();
		List<Character> list = new ArrayList<Character>();
		for (Character character : ca) {
			list.add(character);
		}
		Collections.reverse(list);
		ListIterator iterator = list.listIterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

	public void usingNormalReverseMethod()
	{
		String txt1 = "Hello";

		char[] ca = txt1.toCharArray();
		String reversed="";

		for(int i=ca.length-1;i>=0;i--)
		{
			reversed=reversed+ca[i];
		}

		System.out.println("The reversed String is : "+reversed);

	}
	public void usingInbuildFunctions()
	{
		String txt = "Agni";

		StringBuffer buffer = new StringBuffer(txt);

		System.out.println("Using STRINg BUFFER to reverse a String : "+buffer.reverse());

		StringBuilder builder = new StringBuilder(txt);
		System.out.println("Using String BULDER to reverse a String :  "+builder.reverse());
	}


	public static void main(String[] args)
	{
	string_Reverse rb = new string_Reverse();
	
	rb.usingCollections();
	rb.usingNormalReverseMethod();




	}

}