package javaPrograms_R;

public class swap_2_numbers {


	public void swap2nos_withtemp()
	{
		int my_salary =10;

		int senior_Salary=20;

		int temp;

		temp = my_salary;
		my_salary=senior_Salary;
		my_salary=temp;

		System.out.println("The A value is  "+my_salary+" \n The B value is "+senior_Salary);
	}

	public void swap2nos_withoutTemp()
	{
		int first=10; int second =20;

		first = first-second;
		second=first+second;
		first= second - first;
		System.out.println(first+"\n"+second);
		/*
		first = first*second;
		second = first/second;
		first = first/second;

		System.out.println("divison way : "+first+"\n"+second);
		 */

	}


	public static void main(String[] args)
	{

		swap_2_numbers rb = new swap_2_numbers();
		rb.swap2nos_withoutTemp();


	}

}
