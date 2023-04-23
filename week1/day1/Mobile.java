package week1.day1;

public class Mobile {

	public void sendSMS() {
	
	System.out.println("Send SMS");
	}
	
	protected void allowVoiceCall() {
		System.out.println("Allow voice call");
	}
	private void takeVideo() {
		System.out.println("Take Video");
	}
	public static void main (String[] args) {
		Mobile obj = new Mobile();
		obj.sendSMS();
		obj.allowVoiceCall();
		obj.takeVideo();
	}
}

