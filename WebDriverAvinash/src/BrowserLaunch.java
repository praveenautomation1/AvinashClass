import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "D:\\APIs\\c5\\chromedriver.exe");
		
// creating object for chrome driver class 

		ChromeDriver driver = new ChromeDriver();
	/*	// to open a web page 
		driver.get("url");
		
		// to find an element
		driver.findElementById("id");
		
		// to close the browser
		driver.close();
		// to quit object 
		driver.quit();
		
// child element methods
		
		// to clear text fields
		driver.findElement(By.id("id")).clear();
		
		
		// to type data
		driver.findElement(By.name("id")).sendKeys("data");
	
		// to click on element
		driver.findElement(By.xpath("id")).click();
		*/
		
		/*Example program 
		1. open hrm application 
		2. enter un,pwd
		3. click on login 
		4. click on logout
		
		*/
		
		// to maximize browser
		driver.manage().window().maximize();
		// opem orange hrm appl
		driver.get("http://apps.qaplanet.in//qahrm//login.php");
		
		// wait 2 sec
		Thread.sleep(2000);
		
		// Enter User Name
		driver.findElementByName("txtUserName").clear();
		driver.findElementByName("txtUserName").sendKeys("qaplanet1");
		
		
		// Enter User Name
				driver.findElementByName("txtPassword").clear();
				driver.findElementByName("txtPassword").sendKeys("lab1");
				
		// click on login button 
	
				driver.findElement(By.name("Submit")).click();
				
			// wait for 2 seconds
			
				Thread.sleep(2000);
		
				// click on logout 
				
				driver.findElementByLinkText("Logout").click();
				// wait for 2 sec

				Thread.sleep(2000);
				
				// to get title of the current web page 
				String title =driver.getTitle();
				
				System.out.println(title);

				driver.close();
				
				driver.quit();
				
				
				
				
				
				
				
				
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
