package org.selenium.automation.SeleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;

  
    public void setup() {
    	 WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
    }

   
    public void tearDown() {
        driver.quit();
    }
}
