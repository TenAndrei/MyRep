package SeleniumClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://fb.com");
       driver.findElement(By.linkText("Create New Account")).click();
    driver.manage().window().maximize();
    driver.findElement(By.name("firstname")).sendKeys("John");
       driver.findElement(By.name("lastname")).sendKeys("Smith");
       driver.findElement(By.name("reg_email__")).sendKeys("123645666");
       driver.findElement(By.name("reg_passwd__")).sendKeys("blabla");
       Thread.sleep(2000);
       driver.findElement(By.name("websubmit")).click();
       Thread.sleep(2000);
        driver.quit();


    }
}
