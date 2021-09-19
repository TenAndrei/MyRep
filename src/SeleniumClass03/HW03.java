package SeleniumClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW03 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://syntaxprojects.com");
        driver.findElement(By.linkText("Start Practising")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("//div[@id= 'basic']/div/a[1]")).click();
        Thread.sleep(1200);
        driver.findElement(By.id("user-message")).sendKeys("Andrei");
        Thread.sleep(1200);

        driver.findElement(By.xpath("//form[@id='get-input']/button")).click();

        driver.quit();






    }


}
