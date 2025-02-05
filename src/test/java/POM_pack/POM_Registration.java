package POM_pack;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class POM_Registration {
	private WebDriver driver;

	private String email;
	private String mobile;

	// Constructor
	public POM_Registration(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

//=================================================================
	// First Name
	@FindBy(id = "input-firstname")
	private WebElement firstname_Fields;

	// Last Name
	@FindBy(id = "input-lastname")
	private WebElement LastnameField;

	@FindBy(id = "input-email")
	private WebElement Email;

	@FindBy(id = "input-telephone")
	private WebElement Mobile;

	@FindBy(id = "input-password")
	private WebElement password;

	@FindBy(id = "input-confirm")
	private WebElement ConfirmPassword;

	@FindBy(xpath = "(//input[@value='1'])[2]")
	private WebElement SubscribeRadio_YES;

	@FindBy(xpath = "//input[@value='0']")
	private WebElement SubscribeRadio_NO;

	@FindBy(xpath = "//input[@name='agree']")
	private WebElement disclaimer;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement Continue;

	@FindBy(xpath = "//a[normalize-space()='login page']")
	private WebElement Header_loginhyperlink;

	@FindBy(xpath = "//ul[@class='breadcrumb']//a[normalize-space()='Register']")
	private WebElement BreadcrumbRegister;

// Worning message
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	private WebElement alertmeg_for_Privacy_Policy;

	@FindBy(xpath = "//div[contains(text(),'First Name must be between 1 and 32 characters!')]")
	private WebElement alertmeg_for_Firstname;

	@FindBy(xpath = "//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")
	private WebElement alertmeg_for_Lastname;

	@FindBy(xpath = "//div[contains(text(),'E-Mail Address does not appear to be valid!')]")
	private WebElement alertmeg_for_Email;

	@FindBy(xpath = "//div[contains(text(),'Telephone must be between 3 and 32 characters!')]")
	private WebElement alertmeg_for_telephone;

	@FindBy(xpath = "//div[contains(text(),'Password must be between 4 and 20 characters!')]")
	private WebElement alertmeg_for_Password;

	@FindBy(xpath = "//h1[text()='Register Account']")
	private WebElement Text_RegisterAccount;

	@FindBy(xpath = "//div[@class='text-danger']")
	private WebElement alrtConfirmPassword;

	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	private WebElement Worning_Emailexits;

	@FindBy(xpath = "//div[contains(text(),'E-Mail Address does not appear to be valid!')]")
	private WebElement Worninginvalidemail04;

	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	private WebElement WorningDisclaimer;

	@FindBy(xpath = "//div[text()='Password confirmation does not match password!']")
	private WebElement Worning_NOConfiPassword;

	// CSS properties

//===============================================================================================
	public boolean isDisplyBreadcrum_Register() {
		return BreadcrumbRegister.isDisplayed();

	}

	public String  Get_Worning_NOConfiPassword() {
		return Worning_NOConfiPassword.getText();

	}

	public String Get_WorningDisclaimer() {
		return WorningDisclaimer.getText();

	}
	
	public boolean IsDisclaimerSelected() {
		
		return disclaimer.isSelected();
		
	}

	public String Get_Worning_Emailexits() {
		return Worning_Emailexits.getText();

	}

	public String Get_alrtConfirmPassword() {
		return alrtConfirmPassword.getText();

	}

	public String Get_Text_RegisterAccount() {
		return Text_RegisterAccount.getText();

	}

	public String Get_alertmeg_for_Password() {
		return alertmeg_for_Password.getText();

	}

	public String Get_alertmeg_for_telephone() {
		return alertmeg_for_telephone.getText();

	}

	public String Get_alertmeg_for_Email() {
		return alertmeg_for_Email.getText();

	}

	public String Get_alertmeg_for_Lastname() {
		return alertmeg_for_Lastname.getText();

	}

	public String Get_alertmeg_for_Firstname() {
		return alertmeg_for_Firstname.getText();

	}

	public String Get_alertmeg_for_Privacy_Policy() {
		return alertmeg_for_Privacy_Policy.getText();

	}

	public POM_Registration Send_FirstName(String FirstName) {
		firstname_Fields.sendKeys(FirstName);
		
		return this;
	}

	@SuppressWarnings("deprecation")
	public String get_placeholder_firstname() {
		return firstname_Fields.getAttribute("placeholder");
	}

	public void Send_LastName(String LastName) {
		LastnameField.sendKeys(LastName);
	}

	@SuppressWarnings("deprecation")
	public String get_placeholder_lastname() {
		return LastnameField.getAttribute("placeholder");
	}

	public String Send_Email(String EmailText) {
		Email.sendKeys(EmailText);
		return EmailText;
	}

	@SuppressWarnings("deprecation")
	public String get_placeholder_email() {
		return Email.getAttribute("placeholder");
	}

	public String get_getDomProperty_Email() {
		return Email.getDomProperty("validationMessage");

	}

	public void ClearEmail() {
		Email.clear();

	}

	public String getWorninginvalidemail04() {
		return Worninginvalidemail04.getText();

	}

	public String Send_Mobile(String mobileText) {
		Mobile.sendKeys(mobileText);
		return mobileText;
	}

	@SuppressWarnings("deprecation")
	public String get_placeholder_mobile() {
		return Mobile.getAttribute("placeholder");
	}

	public void Send_password(String ValidPasword) {
		password.sendKeys(ValidPasword);
	}

	@SuppressWarnings("deprecation")
	public String get_placeholder_password() {
		return password.getAttribute("placeholder");
	}

	public String get_DomAttributfotVisibility_password() {
		return password.getDomAttribute("type");
	}

	public void Send_ConfirmPassword(String confirmpasswordText) {
		ConfirmPassword.sendKeys(confirmpasswordText);
	}

	@SuppressWarnings("deprecation")
	public String get_placeholder_confirmpass() {
		return ConfirmPassword.getAttribute("placeholder");
	}

	public String get_DomAttributfotVisibility_CNF_password() {
		return password.getDomAttribute("type");
	}

	public void select_SubscribeRadio_YES() {
		SubscribeRadio_YES.click();
	}

	public void select_SubscribeRadio_NO() {
		SubscribeRadio_NO.click();
	}

	public void Select_disclaimer() {
		disclaimer.click();
	}

	public void clickON_Continue() {
		Continue.click();

	}

	public void click_Header_loginhyperlink() {
		Header_loginhyperlink.click();
	}

}
