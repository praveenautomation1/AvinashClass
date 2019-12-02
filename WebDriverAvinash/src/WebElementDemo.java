import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo {

	
	public static void main(String[] args) {
		
		
		/*WebElement is an interface, interface contains unimplemented methods. By using interface we can create reference objects 
		*/
		
		WebDriver driver = new ChromeDriver();
		
		// to get title
		driver.getTitle();
		// create web element object 
		
		WebElement E = driver.findElement(By.name("name"));
		
		E.clear();
		E.sendKeys("text");
		E.click();
		// verify element present or not 
		boolean ab=E.isEnabled();
		// verify element is selected or not 
		boolean result =E.isSelected();
		System.out.println(result);
		// to get text from element 
		E.getText();
// to get property value for element 
		
		String val=E.getAttribute("property name");
		
		// to get x and y coordinates
		Point P = E.getLocation();
	int x=	P.getX();
		
	int y = P.getY();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
