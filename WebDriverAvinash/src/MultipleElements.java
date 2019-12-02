import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleElements {

	public static void main(String[] args) {
		
		
		FirefoxDriver driver = new FirefoxDriver();
		
		// to find mmultiple elements
		
		driver.findElements(By.className("className"));
		
		// to get links count
	int LC=	driver.findElementsByTagName("a").size();
		
		// way 2
	
	List<WebElement> AL=driver.findElementsByTagName("a");
		
		System.out.println(AL.size());
		
		// to get buttons count 
		
int BC =driver.findElementsByClassName("button").size();
		
		
// to get row count 

int RC=driver.findElementsByXPath("//table/tbody/tr").size();
		
// to get column count 

int CC=driver.findElementsByXPath("//table/tbody/tr[1]/td").size();

	// to get cell count

		
int cellc=driver.findElementsByXPath("//table/tbody/tr/td").size();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
