import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorExample {

	
	/*Java Script Executor Class 
	
	We Can use Java Script commands to perform actions 
	We can write code to fill up text box through Java Script 
	
	Please follow the steps below-
	
	1. Create driver for any web browser (Chrome or Mozilla or any)
	2. Go to the URL 
	3. Create JavascriptExecutor object for the driver
	4. Store the JavaScript command in a string variable
	5. Java Script Executor Object executes the command in the variable
	
	*/
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\APIs\\c5\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("http://apps.qaplanet.in//qahrm//login.php");

	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	String jsUN= "document.getElementsByName('txtUserName')[0].value='qaplanet1'";
	js.executeScript(jsUN);
	
	String jsPwd = "document.getElementsByName('txtPassword')[0].value='lab1'";
	
	js.executeScript(jsPwd);
	
	
	driver.findElementByCssSelector("input.button").click();
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
