package week2.day4;

public abstract class CanaraBank implements Payments {

	public void cashondelivery() {
		// TODO Auto-generated method stub
		System.out.println("Received cash payment");
	}

	public void upipayment() {
		// TODO Auto-generated method stub
		System.out.println("Received UPI payment");
	}

	public void cardpayment() {
		// TODO Auto-generated method stub
		System.out.println("Received Card payment");
	}

	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("Received NEFT payment");
	}

 
	public abstract void recordPaymentDetails();

	
}

