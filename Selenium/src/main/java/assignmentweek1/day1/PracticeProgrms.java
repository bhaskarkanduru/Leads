package assignmentweek1.day1;

public class PracticeProgrms 
{

	public static void main(String[] args) 
	
	{
			
		//Find the greatest number of 3
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
					
		if (num1 > num2 && num1 > num2)
		{
			System.out.println("num1 is greatest");
		}
		else if (num2 > num3 && num2 > num1)
		{
			System.out.println("num2 is greatest");
		}
		else if (num3 > num1 && num3 > num2)
		{
			System.out.println("num3 is greatest");
		}
	
		else 
		{
		System.out.println("numbers are distinct");
	    }
	
		
	
	//Sum of odd numbers upto 20
	int sum=0;
	for (int i = 1; i <= 20; i++)
	{
		if (i % 2 != 0)
		{
			sum = sum + i;
		}
		
	}
	System.out.println(sum);
	}
	
	//Find 17 is a prime number or not
	//int number = 17;
	//if (17%)
	
	
			

	

}
