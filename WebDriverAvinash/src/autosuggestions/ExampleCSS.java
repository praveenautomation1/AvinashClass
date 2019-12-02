package autosuggestions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class ExampleCSS {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\APIs\\c5\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://apps.qaplanet.in/qahrm/login.php");

		driver.findElementByCssSelector("input.loginText").sendKeys("qaplanet1");
driver.findElementByCssSelector("[name=txtPassword]").sendKeys("lab1");		
		
		
		
		
	}
	
	
	
}
