package com.SeleniumClass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver() ; // launch browser
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.facebook.com");//will keep the history that is why i can co back forward
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.close(); // close current tab
        driver.quit(); // quit whole section
    }

}
