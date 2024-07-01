package week2.day3;

public class Chrome extends Browser{

	
	String browsername = "chrome";
	String browserversion = "127.40.7.8";
		void openIncognito()
	{
		System.out.println("Open in incognito");
	}
	
	void clearcache()
	{
		System.out.println("cache is clear");
	}
	public static void main(String[] args) {
		Chrome ch = new Chrome();
		System.out.println(ch.browsername);
		System.out.println(ch.browserversion);
		ch.openURL();
		ch.closeBrwoser();
		ch.navigateBrowser();
		ch.openIncognito();
		ch.clearcache();
		
	}
}
