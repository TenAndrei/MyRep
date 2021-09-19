package SeleniumClass02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass02 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver() ; // launch browser
        driver.get("https://facebook.com"); // will wait for page to be fully load and will not keep the history
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title= driver.getTitle();
       Thread.sleep(5000);
        if(title.equals("Facebook - Log In or Sign Up")) {
            System.out.println("Title is correct");
        }else {
            System.out.println("Title is wrong");
        }
        driver.quit();

    }
}
