package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class KiteLoginPage1 {
	
	//Declaration
	
	@FindBy(xpath="//input[@id='userid']") private WebElement uID;
	@FindBy(xpath="//input[@id='password']") private WebElement pwd;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginBtn;
	
	@FindBy(xpath="(//span[@class='su-message'])[1]") private WebElement eMsg1;
	
	@FindBy(xpath="(//span[@class='su-message'])[2]") private WebElement eMsg2;
	
	
	//Initialization
	KiteLoginPage1(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	//usage
	
	public void enterUserID(String username) {
		uID.sendKeys(username);
	}
	
	public void enterPassword(String Pass) {
		pwd.sendKeys(Pass);
	}
	
	public void clickOnLoginBtn() {
		loginBtn.click();
	}
	
	public void gettext1() {
		String text1 = eMsg1.getText();
	}
	
	public void gettext2() {
		String text2 = eMsg2.getText();
	}
	
}	
	
	
	
