package EX_13072024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Lab310 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.id("login-username"));
        email.sendKeys("admin");
        WebElement passWord = driver.findElement(By.id("login-password"));
        passWord.sendKeys("admin123");
        driver.findElement(By.id("js-login-btn")).click();

        String notification=driver.findElement(By.id("js-notification-box-msg")).getText();
        System.out.println(notification);

        Assert.assertEquals(notification, "Your email, password, IP address or location did not match");
        Thread.sleep(3000);
        driver.close();

    }
}
