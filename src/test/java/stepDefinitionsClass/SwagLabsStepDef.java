package stepDefinitionsClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import sourceDemoAutomation1.*;
import util.ScreenshotUtil;

public class SwagLabsStepDef extends DriverCreation
{

	WebDriver driver;
	WebDriverWait wait;

	@Given("As a user I need to open the Swaglab login page")
	public void as_a_user_i_need_to_open_the_swaglab_login_page()
	{
	   driver=ImportDriverObject();
	   driver.get("https://www.saucedemo.com/");
	   driver.manage().window().maximize();
		System.out.println("Successfully navigated to Login Page");
		ScreenshotUtil.takeScreenshot(driver, "LoginPage");
	}

	@When("User enters correct Username")
	public void user_enters_correct_username()
	{
		LoginPage loginObject=new LoginPage(driver);
		loginObject.enterUserName("standard_user");
		ScreenshotUtil.takeScreenshot(driver, "enter username");

	}

	@When("User enters correct Password")
	public void user_enters_correct_password()
	{
		LoginPage loginObject=new LoginPage(driver);
		loginObject.enterPasword("secret_sauce");
		ScreenshotUtil.takeScreenshot(driver, "enter password");
	}

	@When("User clicks the LoginButton")
	public void user_clicks_the_login_button()
	{
		LoginPage loginObject=new LoginPage(driver);
		loginObject.clickSubmitBtn();
		ScreenshotUtil.takeScreenshot(driver, "click Login button");
	}

	@Then("User need to navigate to the Product home page")
	public void user_need_to_navigate_to_the_product_home_page()
	{
		LoginPage loginObject=new LoginPage(driver);

		if(loginObject.confirmTheNavigation())
		{
			System.out.println("Successfully navigated to ProductPage");
		}
		else
		{
			System.out.println("not navigated");
		}
		ScreenshotUtil.takeScreenshot(driver, "navigate to home page");
	}

@Then("User need to add item two items to cart")
public void user_need_to_add_item_two_items_to_cart() {
	ProductPage productPage=new ProductPage(driver);
	productPage.addToCart();
	ScreenshotUtil.takeScreenshot(driver, "add two item to cart");
}

@When("User clicks the cartIcon")
	public void user_clicks_the_cart_icon() {
		ProductPage productPage=new ProductPage(driver);
		productPage.goToCart();
	}

	@Then("User need to navigate to the Product Cart page")
	public void user_need_to_navigate_to_the_product_cart_page() {
		CartPage cartPage=new CartPage(driver);

		if(cartPage.confirmTheNavigation()) {
			System.out.println("Successfully navigated to Cart");
		}
		ScreenshotUtil.takeScreenshot(driver, "navigate to cart page");
	}

	@Then("User clicks checkout button")
	public void user_clicks_checkout_button() {
		CartPage cartPage=new CartPage(driver);
		cartPage.clickCheckOutBtn();
		ScreenshotUtil.takeScreenshot(driver, "clicked checkout page");
	}

	@Then("User should see the checkout overview page")
	public void user_should_see_the_checkout_overview_page() {
		CheckOutPage checkOutPage=new CheckOutPage(driver);
		if(checkOutPage.confirmTheNavigation()) System.out.println("Successfully navigated to checkout page");
		ScreenshotUtil.takeScreenshot(driver, "checkout overview page");
	}
	@Then("User enters firstName")
	public void user_enters_first_name() {
		CheckOutPage checkOutPage=new CheckOutPage(driver);
		checkOutPage.enterFirstName("Hiruni");
		ScreenshotUtil.takeScreenshot(driver, "enter firstname");
	}
	@Then("User enters lastname")
	public void user_enters_lastname() {
		CheckOutPage checkOutPage=new CheckOutPage(driver);
		checkOutPage.enterLastName("Perera");
		ScreenshotUtil.takeScreenshot(driver, "enter lastname");
	}
	@Then("User enters zipCode")
	public void user_enters_zip_code() {
		CheckOutPage checkOutPage=new CheckOutPage(driver);
		checkOutPage.enterPostalCode("012525");
		ScreenshotUtil.takeScreenshot(driver, "enter postalcode");
	}





	@Then("User enters ContinueButton")
	public void user_enters_continue_button() {
		CheckOutPage checkOutPage=new CheckOutPage(driver);
		checkOutPage.clickCheckOutBtn();
		ScreenshotUtil.takeScreenshot(driver, "enter continue button");
	}
	@Then("User clicks finishedVButton")
	public void user_clicks_finished_v_button() {
		CheckOutPage checkOutPage=new CheckOutPage(driver);
		if (checkOutPage.confirmTheNavigation()){System.out.println("Successfully Navigated to Over view Page");}
		else System.err.println("unable to di");
		ScreenshotUtil.takeScreenshot(driver, "navigated to overview page");
	}
	@Then("User should see the checkout complete Page")
	public void user_should_see_the_checkout_complete_page() {
		CheckOutCompletePage checkOutCompletePage=new CheckOutCompletePage(driver);
		if(checkOutCompletePage.confirmTheNavigation()) System.err.println("Product Successfully checkout");
		else{System.err.println("unable to checkout successfully");}
		ScreenshotUtil.takeScreenshot(driver, "checkout completed");
	}
}
