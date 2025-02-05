package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.AddHasCasting;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Test_loginPage {
	WebDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://tutorialsninja.com/demo/index.php");
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Given("User is Navigated to Login page")
	public void user_is_navigated_to_login_page() {
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("(//a[text()='Login'])[1]")).click();
		System.out.println("user redirect to login page");

	}

	@When("^User Enter Valid Email (.+)$")
	public void user_enter_valid_email(String ValidEmail) {
		driver.findElement(By.id("input-email")).sendKeys(ValidEmail);
	}

	@When("^User Enter Valid Password (.+)$")
	public void user_enter_valid_password(String ValidPassword) {
		System.out.println("Entering password: " + ValidPassword);

		driver.findElement(By.id("input-password")).sendKeys(ValidPassword);
	}

	@When("Clicked on Login button")
	public void clicked_on_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("User should log-in successfully")
	public void user_should_log_in_successfully() {

		Assert.assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/account");
	}

	@Then("^User should navigate to account page$")
	public void user_should_navigate_to_account_page() {
		driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed(), true);
	}
	
	@Then("^User should not log-in$")
	public void user_should_not_log_in() {
	 boolean isloginOptionDisplyOnRHDmenuBar =   driver.findElement(By.xpath("(//a[text()='Login'])[3]")).isDisplayed();
	 
	 Assert.assertEquals(isloginOptionDisplyOnRHDmenuBar, true);
	}

	@Then("^User should disply valid error worning (.*)$")
	public void user_should_disply_valid_error_worning_warning_no_match_for_e_mail_address_and_or_password(String expectedWorningString ) {
	  String worningMessageString =  driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
	 
	  Assert.assertEquals(worningMessageString, expectedWorningString);
	}

	@When("^User Enter Invalid Email (.*)$")
	public void user_enter_invalid_email_test02_gmail_com(String InvalidEmail) {
		
		driver.findElement(By.id("input-email")).sendKeys(InvalidEmail);
	
	}

}
