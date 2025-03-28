package inheritance;

public class TestData {
	
	public void enterCredentials() {

		System.out.println("Credentials entered");
	}
	
	public void navigateToHomePage() {

		System.out.println("Navigated to homepage");
	}

	public static void main(String[] args) {
		TestData td=new TestData();
		td.enterCredentials();
		td.navigateToHomePage();
	}
}
