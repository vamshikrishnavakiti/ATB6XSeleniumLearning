package EX_23072024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Lab329_Challeng1 {

    EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }

    @Test(groups = "QA")
    public void challenge1() throws InterruptedException {
        driver.manage().window().maximize();
        String URL = "https://demo.applitools.com";
        driver.get(URL);
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("Admin");
        driver.findElement(By.id("password")).sendKeys("Password@123");
        driver.findElement(By.id("log-in")).click();
        WebElement table =  driver.findElement(By.xpath("//table[@class='table table-padded']/tbody"));
        List<WebElement> rows_table =table.findElements(By.tagName("tr"));
        double totalAmount =0;
        System.out.println(rows_table.size());
        for (int i=0;i<rows_table.size();i++){
            List<WebElement> columns = rows_table.get(i).findElements(By.tagName("td"));

               if(columns.size()>4){
                   WebElement Amount = columns.get(4);
                   String amountText  = Amount.getText();
                   amountText = amountText.replace("+","").replace("-","").replace(" USD", "");
                   double amount = Double.parseDouble(amountText);
                   if(amountText.startsWith("-")){
                       totalAmount=totalAmount-amount;
                   }else {
                       totalAmount=totalAmount+amount;
                   }


               }


           // System.out.println("Total Aount Spent: $"+totalAmount);
        }
        System.out.println("total Amount: $"+totalAmount);
    }


    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
