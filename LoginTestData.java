package inheritance;

public class LoginTestData extends TestData {

	public void enterUsername() {

		System.out.println("Username Entered");
	}
	public void enterPassword() {

		System.out.println("Password entered");
	}
	
	public static void main(String[] args) {
		LoginTestData ltd=new LoginTestData();
		ltd.enterCredentials();
		ltd.navigateToHomePage();
		ltd.enterPassword();
		ltd.enterUsername();
		
	}
}
