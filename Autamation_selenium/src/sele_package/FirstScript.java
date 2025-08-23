package sele_package;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class FirstScript 
{
    public static void main(String[] args) throws InterruptedException 
    {
    	System.out.println("Its working");
        // 1. Set path to ChromeDriver (skip if using WebDriverManager)
      // System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\webdev\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // 2. Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        
            // 3. Open website
           driver.get("https://openai.com/index/chatgpt/");
           String expectedurl="https://openai.com/index/chatgpt/";
           String actualurl=driver.getCurrentUrl();
           
           System.out.println("Expected Url:"+expectedurl);
           System.out.println("Actual Url:"+actualurl);
            
           driver.manage().window().maximize();
           // 4. Wait for results (basic pause, replace with WebDriverWait in real use)
            Thread.sleep(2000);
            if(expectedurl.equals(actualurl))
            {
            	System.out.println("url validation successful");
            }
            else
            {
            	System.out.println("url validation not successful");
            }
         
           
            driver.close();
           
        }
        
        
    }


