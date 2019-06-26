package week3.day1;

public class AndroidMobile extends Mobile 
{


	@Override
	public void sendSMS() 
	{
		System.out.println("Send SMS to Android Mobile");
	}
	
	@Override
	public void answerCall() 
	{
		System.out.println("Answer Call from Android");
	}
}
