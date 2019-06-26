package assignmentweek1.day1;

public class LearnDifferentMethods 
{

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		String myName = "bhaskar";
		int length = myName.length();
		char[] charArray = myName.toCharArray();
		System.out.println(charArray[charArray.length -2]);
		
		//Convert to uppercase
		System.out.println(myName.toUpperCase());
		
		//Replace last char wirh $ symbol
		char charAt = myName.charAt(length-1);
		System.out.println(myName.replace(charAt, '$'));
		
		//How characters has 'a' in it
		int count = 0;
		{
			for(int i = 0; i<myName.length()-1; i++)
			{
				if(charArray[i] == 'a')
					count++;
		    }
			
		}
	System.out.println(count);	

	// friend name ends with a
	
	String friend = "ko,as,da,ee,sa";
	String[] fri =  friend.split("\\,");
	int lengthupe = fri.length;
	//System.out.println(fName.length);
	
	/*for (int i= 0; i  < lengthupe; i++)
	{
		char friendup = fri [i].charAt(fri[i].length() -1);
		if (friendup == 'a')
			System.out.println(fri[i]);
	}*/
	
	
	for (int i= 0; i  < lengthupe; i++)
	{
		if (fri[i].endsWith("a"))
		{
			System.out.println(fri[i]);
		}
	}
	
	  
	/* public void fName() 
    {
    	
    for(String eachName : fNames)
    {
    System.out.println(eachName);
    }*/
	

	
	
	
	}
	

}
