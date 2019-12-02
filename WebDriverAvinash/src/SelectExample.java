import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {
	
	public static void main(String[] args) {
		
		
		
		
		
		
		ChromeDriver driver = new ChromeDriver();
		
		
		// Create WebElement
		WebElement E = driver.findElementByName("name");
		
		// Select class object creation 
		
		Select sel = new Select(E);
		
		// select commands 
		
		sel.selectByVisibleText("item name"); // select by item name 
		sel.selectByIndex(0); // select by using index, index starts from zero 
		sel.selectByValue("value property"); // select item by using value property
		
		// deselct commands -- are only useful for list box 
		sel.deselectAll();
		sel.deselectByValue("value");
		sel.deselectByVisibleText("text");
		
		// get all options 
		
		List<WebElement> ls= sel.getOptions();
		System.out.println(ls.size());
		
		// get only selected options
		
		
		List<WebElement> swl=sel.getAllSelectedOptions();
		// get first selected option
		
		WebElement fsu =sel.getFirstSelectedOption();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
