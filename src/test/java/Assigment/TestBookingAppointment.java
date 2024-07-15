package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBookingAppointment {
    @Test
    public void bookingAppointment() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getTitle());
       WebElement BookingButton=driver.findElement(By.id("btn-make-appointment"));
        BookingButton.click();
        driver.getTitle();
        String demoUsrName=driver.findElement(By.id("demo_username_label")).getText();
        String demoIsrPw= driver.findElement(By.xpath("//input[@value='ThisIsNotAPassword']")).getText();
        System.out.println(demoUsrName);
        Thread.sleep(3000);
        /*driver.findElement(By.xpath("//input[@name='username']")).sendKeys(demoUsrName);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(demoIsrPw);
        driver.findElement(By.id("btn-login")).click();


       WebElement select_facility=driver.findElement(By.xpath("//select[@id='combo_facility']/option[text()='Hongkong CURA Healthcare Center']"));
        select_facility.click();
        driver.findElement(By.xpath("//div[@class='input-group-addon']")).click();
        WebElement date=driver.findElement(By.xpath("//div[@class='datepicker-days']//td[@class='old day']"));
    date.click();
    driver.findElement(By.xpath("")).sendKeys("Allery ");
    driver.findElement(By.id("btn-book-appointment")).click();

    Thread.sleep(3000);
String conText=    driver.findElement(By.xpath("//div[@class='col-xs-12 text-center']")).getText();
        System.out.println(conText);
        Assert.assertEquals(conText,"Appointment Confirmation");
      Thread.sleep(2000);
      driver.close();*/

    }
}
