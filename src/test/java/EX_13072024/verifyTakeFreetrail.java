package EX_13072024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class verifyTakeFreetrail

{
    @Test
    public void verifyFreetrail() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        WebElement freetrailLink =driver.findElement(By.linkText("Start a free trial"));
        freetrailLink.click();
        Thread.sleep(3000);
        driver.findElement(By.id("page-v1-step1-email")).sendKeys("admin1224@admin.com");
        WebElement checkBox=driver.findElement(By.name("gdpr_consent_checkbox"));
        checkBox.click();
       List<WebElement> buttonList=driver.findElements(By.tagName("button"));//
       buttonList.get(0).click();
        Thread.sleep(2000);

        WebElement erro_msg_email_exists=driver.findElement(By.className("invalid-reason"));
        System.out.println(erro_msg_email_exists.getText());

    }
}
