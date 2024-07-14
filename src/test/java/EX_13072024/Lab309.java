package EX_13072024;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;

public class Lab309 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.get("https://google.com");
    System.out.println(driver.getTitle());
    Assert.assertEquals(driver.getTitle(),"Google");
    driver.quit();
        //
    }
    }



