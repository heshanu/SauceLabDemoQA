package sourceDemoAutomation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutCompletePage {
	WebDriver checkOutCompletePagedriver;

	public CheckOutCompletePage(WebDriver driver)
	{
		this.checkOutCompletePagedriver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
	WebElement checkOutCompletedLabel;

	public boolean confirmTheNavigation()
	{
		boolean checkOutCompletedPageVisibility;
		if (checkOutCompletedLabel.isDisplayed()) checkOutCompletedPageVisibility = true;
		else checkOutCompletedPageVisibility = false;
		return checkOutCompletedPageVisibility;
	}

}
