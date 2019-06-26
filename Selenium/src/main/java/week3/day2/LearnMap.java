package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class LearnMap 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		String companyname = "CAPGEMINI";
		char[] ca = companyname.toCharArray();
	
		Map<Character, Integer> companymap = new HashMap<>();
		for (char c : ca) 
		{
			if(companymap.containsKey(c))
			{
				
				companymap.put(c, companymap.get(c)+1);
				
			}
			else
			{
				companymap.put(c, 1);
							}
		}
		//System.out.println(companymap.get(ca) + " " + companyname.ge);

	}
		


}
