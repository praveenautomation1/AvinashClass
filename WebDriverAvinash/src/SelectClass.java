import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		
		// to work with drop down/ list box we have to use Select Class
		
		
		ChromeDriver driver = new ChromeDriver();
		// way 1
		
		 new Select(driver.findElement(By.id("loc_code"))).selectByVisibleText("Emp. First Name");

		 // way 2
		 
		 WebElement E = driver.findElement(By.name("name"));
		 
		 Select x = new Select(E);
		 x.selectByVisibleText("Emp. First Name");
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
