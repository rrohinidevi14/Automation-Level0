package Sanitytest;

public class Superclass extends Login1{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/rohini/Documents/Selinium Driver/chromedriver");
		Login1 rohini = new Login1();
				rohini.login();
				rohini.Checktitle();
				rohini.logout();
				rohini.Checktitle();
	}

}
