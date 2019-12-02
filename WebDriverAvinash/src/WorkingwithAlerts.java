import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithAlerts {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		
		// alert handling 
		
		// to handle an alert we need to switch to it first
		
		driver.switchTo().alert();
		
		// to click on ok 
		driver.switchTo().alert().accept();
		
		// to click on cancel button on alert
		driver.switchTo().alert().dismiss();
		
		// to get alert message
		driver.switchTo().alert().getText();
		
		// way 2
		
		// Alert is an interface. using this we can created reference object to alerts
		
		// creating reference object for alerts
		Alert A = driver.switchTo().alert();
		
		A.accept(); // to click on OK 
A.dismiss(); // to cancel alert 
A.getText(); // to get text from alert

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
