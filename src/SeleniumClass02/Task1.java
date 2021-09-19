package SeleniumClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // launch browser

        driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        String title = driver.getTitle();
        System.out.println(title);
        if (title.equals("Web Orders")) {
            System.out.println("title is correct");
        } else {
            System.out.println("title in not correct");
        }
        driver.findElement(By.id("ctl00_logout")).click();
        driver.quit();

    }
}
