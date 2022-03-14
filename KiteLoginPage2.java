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
	
	
	
	
