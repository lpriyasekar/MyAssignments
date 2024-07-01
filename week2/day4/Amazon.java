package week2.day4;

public class Amazon extends CanaraBank{

	@Override
	public void recordPaymentDetails() {
		// TODO Auto-generated method stub
		System.out.println("payment details");
	}
	public static void main(String[] args) {
		Amazon am = new Amazon();
		am.recordPaymentDetails();
		am.cardpayment();
		am.cashondelivery();
		am.upipayment();
		
		 
	}

}
