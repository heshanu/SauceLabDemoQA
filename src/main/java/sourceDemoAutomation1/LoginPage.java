package sourceDemoAutomation1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage 
{
	WebDriver loginPagedriver;
 public LoginPage(WebDriver driver)
 {
	 this.loginPagedriver=driver;
	 PageFactory.initElements(driver, this);
 }
 @FindBy (id="user-name")
 WebElement userNameEle;
 
 @FindBy (id="password")
 WebElement PasswordEle;
 
 @FindBy (id="login-button")
 WebElement loginButn;

 public void enterUserName(String userName)
 {
	 userNameEle.sendKeys(userName);
 }

 public void enterPasword(String password)
 {
	 PasswordEle.sendKeys(password);
 }

 public void clickSubmitBtn()
 {
	 loginButn.click();
 }

 @FindBy (xpath="//*[@id=\"header_container\"]/div[2]/span")
 WebElement ProductLable;
 
 public boolean confirmTheNavigation()
 {
	 return ProductLable.isDisplayed();
	 
 }
 
 
 
}
