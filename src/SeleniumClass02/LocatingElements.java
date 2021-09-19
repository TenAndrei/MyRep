package SeleniumClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://fb.com");
        driver.findElement(By.id("email")).sendKeys("fasd@.com");
        driver.findElement(By.id("pass")).sendKeys("yyoyo");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.linkText("Forgot Password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();
        Thread.sleep(5000);
        driver.quit();

    }
}
