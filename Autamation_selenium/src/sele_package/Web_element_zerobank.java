package sele_package;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_element_zerobank {

    public static void loginStep(WebDriver driver, String user1, String pass1, String testexecution) throws InterruptedException {
        System.out.println("Manual test --> " + testexecution);

        // Locate username field
        WebElement user = driver.findElement(By.id("user_login"));
        user.clear();
        user.sendKeys(user1);

        // Locate password field
        WebElement pass = driver.findElement(By.id("user_password"));
        pass.clear();
        pass.sendKeys(pass1);

        // Click on sign-in button
        driver.findElement(By.name("submit")).click();

        Thread.sleep(2000);

        // Validation
        try {
            if (driver.getPageSource().contains("Welcome") || driver.getCurrentUrl().contains("account-summary")) {
                System.out.println("✅ Test Passed: " + testexecution);
            } else {
                System.out.println("❌ Test Failed: " + testexecution);
            }
        } catch (Exception e) {
            System.out.println("❌ Test Failed with exception: " + e.getMessage());
        }

        driver.navigate().back(); // Go back for the next test
        Thread.sleep(2000);
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");

        System.out.println("Welcome to Zero bank Login page");

        // Test cases
        loginStep(driver, "865645", "password", "Invalid username");
        loginStep(driver, "username", "98786745", "Invalid password");
        loginStep(driver, "8656jhfj", "ngdj56465", "Invalid username and password");
        loginStep(driver, "", "", "Empty username and password");
        loginStep(driver, "username", "password", "Valid login");

        driver.quit();
    }
}
