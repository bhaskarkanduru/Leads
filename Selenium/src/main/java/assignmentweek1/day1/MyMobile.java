package assignmentweek1.day1;

public class MyMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m = new Mobile();
		int mobileWeight = m.getMobileWeight(6);
		System.out.println(mobileWeight);
		
		 String mobileColor = m.getMobileColor("Blue");
		System.out.println(mobileColor);
		
	    m.saveContact("+9176435566");
		
		
		m.mobileModel();
      
        		
	}

}
