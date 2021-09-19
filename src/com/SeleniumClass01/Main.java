package com.SeleniumClass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver() ; // launch browser
        driver.get("https://www.google.com"); // will wait for pagw to be fully load and will not keep the history
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title= driver.getTitle();
        System.out.println(title);
        driver.quit();

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver1=new ChromeDriver();
        driver1.get("https://www.amazon.com");
        String url2=driver1.getCurrentUrl();
        System.out.println(url2);
        String title2=driver1.getTitle();
        System.out.println(title2);
        driver1.quit();
    }
}
