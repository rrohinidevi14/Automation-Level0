package Sanitytest;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login1 {
	// class variable declaration
	static String  title;
	WebDriver driver = new ChromeDriver();
	WebElement pwd;
	
	public void login() {
		System.setProperty("webdriver.chrome.driver","/Users/rohini/Documents/Selinium Driver/chromedriver");
		driver.get("http://sys-cms.nbcnews.com");
		System.out.println(driver.getTitle());
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Username");
		String email= scan.next();
		System.out.println("Enter password");
		String password = scan.next();
		driver.findElement(By.id("edit-name")).sendKeys(email);
		 pwd = driver.findElement(By.id("edit-pass"));
		pwd.sendKeys(password); // enter password
		driver.findElement(By.id("edit-submit")).click();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		}
	
	public  void Checktitle() {
		title = driver.getTitle();
		switch (title) {	
			case "User account | NewsCMS" :	
			System.out.println("Logged out and Reached Landing page");
			break;
			case "My Dashboard | NewsCMS" :	
			System.out.println("Reached Mydashboard page");
			break;
			default :
			System.out.println("invalid page");
			}	
		}
	
	public void Invalidlogin() {
		driver.findElement(By.id("edit-name")).sendKeys("rrohinidevi@gmail.com");
		pwd.sendKeys("Pa55word");
		driver.findElement(By.id("edit-submit")).click();	
	}

	public void logout() {	
		driver.findElement(By.linkText("Log out")).click();
	}
	
	}



	
		
	


