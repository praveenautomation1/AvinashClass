import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitExamples {

	public static void main(String[] args) {
		
FirefoxDriver driver = new FirefoxDriver();		
		
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
driver.manage().timeouts().setScriptTimeout(40,TimeUnit.SECONDS);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
