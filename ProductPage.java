package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage{
	  WebDriver driver;
	  By cartBtn = By.className("shopping_cart_link");

	  public ProductPage(WebDriver d) { this.driver = d; }

	  public void gotoCart() { driver.findElement(cartBtn).click(); }
	}
