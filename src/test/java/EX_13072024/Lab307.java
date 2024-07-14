package EX_13072024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Lab307 {

    public static void main(String[] args) throws InterruptedException {

        EdgeOptions options = new EdgeOptions();

                //Browser- Headless mode _ No UI;Fast;
                        // Full mode - with UI, Slow.
        // options.addArguments("--start-maximized");
        //options.addArguments("window-size=800,600");
        options.addArguments("--guest");
        WebDriver driver = new EdgeDriver(options);
        driver.get("https://google.com");

       driver.manage().window().maximize();


        driver.quit();
    }
}
