package SeleniumClass06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

    public static String url= "http://www.uitestpractice.com/Students/Switchto";
    public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement simpleAlertButton =driver.findElement(By.id("alert"));
        simpleAlertButton.click();
       Alert simpleAlert =  driver.switchTo().alert();
       Thread.sleep(2000);
       simpleAlert.accept();

       WebElement confirmAlertButton= driver.findElement(By.id("confirm"));
       confirmAlertButton.click();
       Alert confrimAlert = driver.switchTo().alert();
       String alertText = confrimAlert.getText();
        System.out.println(alertText);
        confrimAlert.dismiss();

        WebElement promtAlertButton = driver.findElement(By.id("prompt"));
        promtAlertButton.click();
        Thread.sleep(2000);
        Alert promptAlers = driver.switchTo().alert();
        promptAlers.sendKeys("Asghar is a King");
        promptAlers.accept();


    }
}
