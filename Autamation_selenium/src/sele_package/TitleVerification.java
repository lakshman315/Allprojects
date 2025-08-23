package sele_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException {
        // Set ChromeDriver path (change for your system)
        //System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");

        // Create WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Expected title
        String expectedTitle = "Google";

        // Open website
        driver.get("https://www.google.com");

        // Get actual title
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Thread.sleep(5000);
        // Compare
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test Passed ✅");
        } else {
            System.out.println("Test Failed ❌");
        }

        // Close browser
        driver.close();
    }
}

