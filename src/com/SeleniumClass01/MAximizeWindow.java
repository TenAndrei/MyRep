package com.SeleniumClass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MAximizeWindow {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver() ; // launch browser
        driver.navigate().to("https://www.google.com"); // navigate to google
       driver.manage().window().maximize();
        driver.manage().window().fullscreen();

    }
}
