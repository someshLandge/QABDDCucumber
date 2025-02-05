package POM_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_Pack.Reusable_details;

public class POM_AccountSuccess {
	
	private WebDriver driver;
	public String email;
	public String mobile;

	// Constructor
	public POM_AccountSuccess(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.email = Reusable_details.reusableEmail();
		this.mobile = Reusable_details.reusableMobile();
	}
//=========================================================================

	@FindBy(xpath = "//a[normalize-space()='Continue']")
	private WebElement succ_ContinueCTA;

	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	private WebElement successMesssageOnAccountPage;
	
//============================================================================================

	public void click_ucc_ContinueCTA() {
		succ_ContinueCTA.click();
	}

	public String GetTest_Success_messgae_on_Accountpage() {
		return successMesssageOnAccountPage.getText();
	}
	
	public boolean IsDisply_Success_messgae_on_Accountpage() {
		return successMesssageOnAccountPage.isDisplayed();
	}

}
