package week1.day1;

public class Mobile1{
	
public void makeCall() {
	
	String mobileModel = "One Plus";
	float mobileWeight = 130.5f;
	
	System.out.println("This is my one plus mobile with 130.5 weight");
}

public void sendMsg() {
	
	Boolean fullCharged = true;
	int mobileCost = 25000;
	
	System.out.println("fully Charged and mobile Cost around 25000");
}


public static void main(String[] args)
{
	Mobile1 obj=new Mobile1();
	obj.makeCall();
	obj.sendMsg();
	
}
}
