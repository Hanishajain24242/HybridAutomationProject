package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import config.ConfigReader;
import drivers.driverfactory;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        String browser = ConfigReader.getProperty("browser");
        driver = driverfactory.initDriver(browser);
        driver.get(ConfigReader.getProperty("url"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
