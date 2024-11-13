package sourceDemoAutomation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutStepTwo {
	WebDriver checkOutStepTwo;

	public CheckOutStepTwo(WebDriver driver)
	{
		this.checkOutStepTwo=driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy (xpath = "//*[@id=\"finish\"]")
	WebElement checkOutBtn;

	public void clickFinished()
	{
		checkOutBtn.click();
	}

	@FindBy (xpath="//*[@id=\"header_container\"]/div[2]/span")
	WebElement ProductLable;

	public boolean confirmTheNavigation()
	{
		boolean ProductLableVisibility=ProductLable.isDisplayed();
		return ProductLableVisibility;

	}
}
