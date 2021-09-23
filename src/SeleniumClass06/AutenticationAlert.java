package SeleniumClass06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutenticationAlert {

    public static String url="https://admin:admin@the-internet.herokuapp.com/basic_auth";
  // username:password@
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();


    }}
