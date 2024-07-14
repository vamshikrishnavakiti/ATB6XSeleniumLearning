package EX_13072024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab311 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.id("login-username"));
        email.sendKeys("admin");
        WebElement passWord = driver.findElement(By.id("login-password"));
        passWord.sendKeys("admin123");
          Thread.sleep(2000);
           // Linkstext/ partialLink text works with only with <a>tags
        driver.findElement(By.partialLinkText("Start a free trial")).click();

           driver.close();
    }
}
