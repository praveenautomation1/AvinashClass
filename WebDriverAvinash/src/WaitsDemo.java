import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsDemo {
	
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		
		// wait object 
		
		WebDriverWait wait  = new WebDriverWait(driver,60);
		
		// wait for title
		
		wait.until(ExpectedConditions.titleIs("title"));
		
		// wait for partial title
		wait.until(ExpectedConditions.titleContains("title"));
		
		// wait for alert 
		wait.until(ExpectedConditions.alertIsPresent());
		
		// wait for element 
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("name")));
		
		// wait for text
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("xpathExpression"), "text"));
		
		
		// wait for property 
		
		wait.until(ExpectedConditions.attributeContains(By.name("name"), "attribute", "value"));
		
		// wait until element become enabled
		
		wait.until(ExpectedConditions.elementToBeClickable(By.name("name")));
		
// wait for frame and switch to it 
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("locator"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
