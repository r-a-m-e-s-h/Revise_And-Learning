package javaPrograms_R;

public class String_Length_R {
	
	
	public static void main(String[] arg)
	{
		String txt ="hello world";
		int length=0;
		char[] ca = txt.toCharArray();
		for(char c: ca)
		{
			length++;
		}
		System.out.println("The length of the string is : "+length);
		
		System.out.println("using the legth funtion to find The length of the string is : "+txt.length());
	}
	

}
