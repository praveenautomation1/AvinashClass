import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassExample {
	
	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		// create object for Actions Class
		
		Actions A = new Actions(driver);
		
		// to perform click Action 
		A.click(driver.findElementByClassName("classname")).perform();
		
		// to perform double click 

		A.doubleClick(driver.findElementByName("Name")).perform();
		// way 2
	
		
WebElement E= driver.findElementByClassName("classname");
		
A.click(E).perform();
A.doubleClick(E).perform();

// mouse hover

A.moveToElement(E).perform();

// 

		
WebElement src= driver.findElementByClassName("classname");
		
WebElement des= driver.findElementByClassName("classname");

		
		
		// Way 1 drag and drop 


A.clickAndHold(src).perform();
A.moveToElement(des).perform();


// You can swing from frame to frame (or into iframe)

// to focus on a particular frame
 
driver.switchTo().frame("framename");
// to switch to parent frame
driver.switchTo().parentFrame();

// to go back to default page 
driver.switchTo().defaultContent();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
