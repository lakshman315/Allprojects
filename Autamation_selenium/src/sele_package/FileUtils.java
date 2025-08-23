package sele_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileUtils {

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        Thread.sleep(5000); // Wait for page to load
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 400)");

        // First Name
        WebElement fname = driver.findElement(By.id("firstName"));
        fname.clear();
        fname.sendKeys("Lakshman");

        // Last Name
        WebElement lname = driver.findElement(By.id("lastName"));
        lname.clear();
        lname.sendKeys("Vangapandu");

        // Email
        WebElement email = driver.findElement(By.id("userEmail"));
        email.clear();
        email.sendKeys("Lakshmanvangapandu@gmail.com");

        // Select Gender (Female in this example)
        driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
        js.executeScript("window.scrollBy(0, 700)");

        // Mobile number
        WebElement mobile = driver.findElement(By.id("userNumber"));
        mobile.clear();
        mobile.sendKeys("9898989899");

        // Date of Birth (set to 12 Aug 2025)
        WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
        dob.click();
        Thread.sleep(1000);
        Select monthSelect = new Select(driver.findElement(By.className("react-datepicker__month-select")));
        monthSelect.selectByVisibleText("August");
        Select yearSelect = new Select(driver.findElement(By.className("react-datepicker__year-select")));
        yearSelect.selectByVisibleText("2025");
        driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day--012') and not(contains(@class, 'outside-month'))]")).click();

        // Subjects
        String[] subjects = {"Maths", "Physics", "Chemistry", "English"};
        WebElement sub = driver.findElement(By.id("subjectsInput"));
        for (String subject : subjects) {
            sub.sendKeys(subject);
            sub.sendKeys(Keys.ENTER);
        }
        js.executeScript("window.scrollBy(0, 900)");

        // Hobbies (select Sports and Music)
        driver.findElement(By.xpath("//label[contains(text(), 'Sports')]")).click();
        driver.findElement(By.xpath("//label[contains(text(), 'Music')]")).click();

        // Picture upload
        WebElement img = driver.findElement(By.id("uploadPicture"));
        img.sendKeys("C:\\Users\\HP\\Downloads\\download.jpg");

        // Current Address
        WebElement address = driver.findElement(By.id("currentAddress"));
        address.clear();
        address.sendKeys("123 Example Street, Sample City");

        // State and City
        driver.findElement(By.id("state")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(), 'NCR')]")).click();
        driver.findElement(By.id("city")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(), 'Delhi')]")).click();

        // Take screenshot after filling the form
        captureScreenshot(driver, "formFilled");

        // Submit the form
        driver.findElement(By.id("submit")).click();

        // Take screenshot after submission
        captureScreenshot(driver, "formSubmitted");

        Thread.sleep(6000);
        driver.quit();
    }

    // Method to capture screenshot
    public static void captureScreenshot(WebDriver driver, String screenshotName) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        File destination = new File("screenshots/" + screenshotName + "_" + timestamp + ".png");
        destination.getParentFile().mkdirs(); // Create screenshots directory if it doesn't exist
        FileUtils.copyFile(source, destination);
    }

	private static void copyFile(File source, File destination) {
		
		
	}
}