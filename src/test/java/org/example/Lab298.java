package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab298 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://sdet.live");
        driver.close();
    }
}
