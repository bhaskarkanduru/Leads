package week3.day1;

public class MyMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AndroidMobile androidmobile = new AndroidMobile();
		androidmobile.answerCall();
		androidmobile.sendSMS();
		androidmobile.playMusic();
		
		AppleMobile applemobile = new AppleMobile();
		applemobile.answerCall();
		applemobile.sendSMS();
		applemobile.playMusic();
		
	}

}
