package sourceDemoAutomation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {
	WebDriver productPageDriver;
	WebDriverWait wait;

	@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
	 WebElement cartLink;

	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
	WebElement productOne;

	@FindBy(xpath = "//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
	WebElement productTwo;

	public ProductPage(WebDriver driver) {
		this.productPageDriver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds timeout
	}

	public void addToCart() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(productOne)).click();
			wait.until(ExpectedConditions.elementToBeClickable(productTwo)).click();
		} catch (Exception e) {
			System.err.println("Error clicking the 'Add to Cart' button for item: " + e.getMessage());
			throw e;
		}
	}

	public void goToCart() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(cartLink)).click();
		} catch (Exception e) {
			System.err.println("Error clicking the 'Cart' link: " + e.getMessage());
			throw e; // Re-throw the exception after logging
		}
	}
}
