


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.vel.config.Configurations;

public class A {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VINAY\\Desktop\\vinay\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
		
		
		Thread.sleep(2000);
		
		
		((JavascriptExecutor)driver).executeScript("scroll(0,-1000)");
		
		
	}

}
