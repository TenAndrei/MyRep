package SeleniumClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    /*HW
    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    fill out the form
    click on register
    close the browser
*/


    public static void main(String[] args) throws InterruptedException {

       System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        WebElement userfirstname=driver.findElement(By.id("customer.firstName"));
        userfirstname.sendKeys("Sherlock");
        WebElement userlastname=driver.findElement(By.id("customer.lastName"));
        userlastname.sendKeys("Holmes");
        WebElement useradress=driver.findElement(By.id("customer.address.street"));
        useradress.sendKeys("121B Baker st");
        WebElement usercity=driver.findElement(By.id("customer.address.city"));
        usercity.sendKeys("London");
        WebElement userstate=driver.findElement(By.id("customer.address.state"));
        userstate.sendKeys("Unknown");
        WebElement userzipcode=driver.findElement(By.id("customer.address.zipCode"));
        userzipcode.sendKeys("12345");
        WebElement userphone=driver.findElement(By.id("customer.phoneNumber"));
        userphone.sendKeys("1234567890");
        WebElement userssn=driver.findElement(By.id("customer.ssn"));
        userssn.sendKeys("12457896");
        WebElement username=driver.findElement(By.id("customer.username"));
        username.sendKeys("Sherlock4ever");
        WebElement userpassword=driver.findElement(By.id("customer.password"));
        userpassword.sendKeys("Watson");
        WebElement passwordconfirm=driver.findElement(By.id("repeatedPassword"));
        passwordconfirm.sendKeys("Watson");
        driver.findElement(By.className("button")).click();


     /*navigate to fb.com
     click on create new account
     fill up all the textboxes
     click on sign up button
     close the pop up
     close the browser*/

        driver.navigate().to("https://fb.com");
        driver.findElement(By.id("u_0_2_Z8")).click();
        WebElement firstname=driver.findElement(By.id("u_g_b_1V"));
        firstname.sendKeys("BOb");
        WebElement lastname=driver.findElement(By.id("u_g_d_m0"));
        lastname.sendKeys("Smith");
        WebElement phoneoremail=driver.findElement(By.id("u_g_g_gA"));
        phoneoremail.sendKeys("1234567890");
        WebElement password=driver.findElement(By.id("password_step_input"));
        password.sendKeys("blabla");
        driver.findElement(By.id("u_g_s_Zu")).click();
        Thread.sleep(2000);
        driver.quit();










    }

}
