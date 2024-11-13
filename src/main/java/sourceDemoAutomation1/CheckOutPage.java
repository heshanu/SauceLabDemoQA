package sourceDemoAutomation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOutPage {
	WebDriver checkOutDriver;
	WebDriverWait wait;

	public CheckOutPage(WebDriver driver)
	{
		this.checkOutDriver=driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds timeout
	}

	//WebElement userNameEle=loginPagedriver.findElement(By.id("user-name"));

	@FindBy(xpath = "//*[@id=\"first-name\"]")
	WebElement fristNameEle;

	@FindBy (xpath = "//*[@id=\"last-name\"]")
	WebElement lastNameEle;

	@FindBy (xpath = "//*[@id=\"postal-code\"]")
	WebElement zipCodeEle;

	@FindBy (xpath = "//*[@id=\"continue\"]")
	WebElement checkOutBtn;

	public void enterFirstName(String firstName)
	{
		fristNameEle.sendKeys(firstName);
	}
	public void enterLastName(String lastName)
	{
		lastNameEle.sendKeys(lastName);
	}

	public void enterPostalCode(String zipCode){
		zipCodeEle.sendKeys(zipCode);
	}
	public void clickCheckOutBtn()
	{
		checkOutBtn.click();
	}

	@FindBy (xpath="//*[@id=\"header_container\"]/div[2]/span")
	WebElement checkOutLabel;

	public boolean confirmTheNavigation()
	{
		return checkOutLabel.isDisplayed();

	}
}
