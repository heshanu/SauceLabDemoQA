package sourceDemoAutomation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class  CartPage {
	WebDriver cartDriver;
	WebDriverWait wait;

	public CartPage(WebDriver driver)
	{
		this.cartDriver=driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(1000));// 10 seconds timeout
	}

	@FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
	WebElement cartLabels;

	@FindBy(xpath = "//*[@id=\"checkout\"]")
	WebElement checkOutBtn;

	public void clickCheckOutBtn()
	{
		try {
			wait.until(ExpectedConditions.elementToBeClickable(checkOutBtn)).click();
		} catch (Exception e) {
			System.err.println("Error clicking the 'Cart' link: " + e.getMessage());
			throw e; // Re-throw the exception after logging
		}
	}

	public boolean confirmTheNavigation() {
		try {
			return cartLabels.isDisplayed();
		} catch (Exception e) {
			System.err.println("Error clicking the 'Cart' link: " + e.getMessage());
			throw e; // Re-throw the exception after logging
		}
	}
}
