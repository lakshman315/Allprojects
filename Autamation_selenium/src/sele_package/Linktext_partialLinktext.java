package sele_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext_partialLinktext {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/results?search_query=viral+vayyari+song");
        Thread.sleep(5000);
        driver.manage().window().maximize();
         driver.findElement(By.linkText("Viral Vayyari (Telugu) Lyrical Video | Junior Movie | Kireeti, Sreeleela | Radha Krishna | DSP")).click();
        //driver.findElement(By.partialLinkText("Vayyari")).click();
    }
}