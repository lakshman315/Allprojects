package sele_package;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerobank {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
       driver.get("http://zero.webappsecurity.com/login.html");
       System.out.println("page loaded successfully");
       {
    	   System.out.println("Manual test::---->check user is able to login with valid credentials");
       }
       
       //location username text field
       driver.findElement(By.id("user_login")).click();
       driver.findElement(By.id("user_login")).sendKeys("username");
       
       //location password text field
       driver.findElement(By.id("user_password")).click();
       driver.findElement(By.id("user_password")).sendKeys("password");
      
       // click on signin button
       driver.findElement(By.id("submit")).click();
       System.out.println("login successfully");
       Thread.sleep(5000);
       driver.close();
	}

}
