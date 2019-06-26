package assignmentweek1.day1;

public class HomeworkWeek1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//write a program to find the sum of the digits
		
		
		int m = 256, n, sum1 = 0 ;
		
				while(m>0)
				{
				 n=m % 10;
				 sum1 = sum1 + n;
				 m = m/10;
				}
				System.out.println("sum" + sum1);
							
		//Write a java program to check whether the given String is a palindrome. String: "LeveL"
				
				String a = "Bhaskar", b ="";
				int c = a.length();
				
				for(int i = c - 1; i >= 0; i-- ) 
				{
					b = b + a.charAt(i);
				}
				System.out.println(b);
				
				if(a.equalsIgnoreCase(b))
				{
					System.out.println("palindrome");
					
			
				}
				else 
				{
					System.out.println("Not a palindrome");
				}
				

				//.Write a java program to create a int array and sort it in ascending order
				
				
				 int p, temp;
			       
			      
			        int[] array = {12, 3, 5, 27, 89, 1};
			        int arraylength = array.length;
			      
			        for (int i = 0; i < arraylength; i++) 
			        {
			            for (int j = i + 1; j < arraylength; j++) 
			            {
			                if (array[i] > array[j]) 
			                {
			                    temp = array[i];
			                    array[i] = array[j];
			                    array[j] = temp;
			                }
			            }
			        }
			        System.out.print("Ascending Order:");
			        for (int i = 0; i < arraylength - 1; i++) 
			        {
			            System.out.print(array[i] + ",");
			        }
			        System.out.print(array[arraylength - 1]);
	}


	
}
	


