package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class vwoLoginAssignment

{
    @Test(priority = 0)
    public void login_VaidCreds() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://app.vwo.com");
        WebElement email = driver.findElement(By.id("login-username"));
        email.sendKeys("admin1224@admin.com");
        WebElement passWord = driver.findElement(By.id("login-password"));
        passWord.sendKeys("Admin@123");

        WebElement submitButton =driver.findElement(By.id("js-login-btn"));
         submitButton.click();
        Thread.sleep(3000);
        driver.getTitle();
        Assert.assertEquals(driver.getTitle(), "Login - VWO");

        driver.close();


    }

    @Test(priority = 1)
    public void login_InvalidCreds() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://app.vwo.com");
        WebElement email = driver.findElement(By.id("login-username"));
        email.sendKeys("admin1224@admin.com");
        WebElement passWord = driver.findElement(By.id("login-password"));
        passWord.sendKeys("Admin@");

        WebElement submitButton = driver.findElement(By.id("js-login-btn"));
        submitButton.click();
        Thread.sleep(3000);
     String notification =driver.findElement(By.id("js-notification-box-msg")).getText();

     Assert.assertEquals(notification,"Your email, password, IP address or location did not match");

     driver.close();

    }
}
