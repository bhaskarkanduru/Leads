package assignmentweek1.day1;

public class Mobile {
	
	int mobileWeight = 1;
	String mobileColor = "Black";
	String mobileNumber;
	String contactName;
	
	
	public String getMobileColor(String color )
	{
	return "red";
	}
	
	public void makeCall()
	{
		System.out.println("MadeCall");
		
	}
	
    public int getMobileWeight (int mweight)
    {
    	return 2;
    }
    
   /* public String saveContact(String mNumer) 
    {
    	
    			if(mNumer.equals("+9176435566"))
    	System.out.println("Bhaskar");
    	
    	else if  (mNumer.equals("+918939229285"))  {
    		System.out.println("Bhargavi");
					} 
    	else if (mNumer.equals("+9490327684"))
    		{
        		System.out.println("Anil");
		}
    		else
    			
    			System.out.println("unknown");
				return contactName;
    }*/
    
    public void saveContact(String mNumber) 
    {
    	
    	switch (mNumber) 
    	{
		case "+9176435566":
			System.out.println("Bhaskar");
			
			break;

		case "+918939229285":
			System.out.println("Bhargavi");
			
			break;
		case "+9490327684":
			System.out.println("Anil");
			break;
			
			default:
			System.out.println("Unknown");
				break;
			}
			
    }
    
    String[] mobileModels = { "s1", "s2", "s3", "s4", "s5"};
    public void mobileModel() 
    {
    	
    for(String eachModel : mobileModels )
    {
    System.out.println(eachModel);
    } 
    
      
    /*for (int i=0; i<4; i++) {
    	System.out.println(mobileModels[i]);*/
    	
    }
    
    
    	
    	
    }
    
    

    

