import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

import org.apache.commons.io.FileUtils;
public class Screenshot {

	 
		public static void main(String[] args) throws Exception {
		
			System.setProperty("webdriver.chrome.driver", "D:\\APIs\\c5\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://apps.qaplanet.in/qahrm/login.php");
			TakesScreenshot ts = (TakesScreenshot)driver;
			
	        //Call getScreenshotAs method to create image file

//			File source = 
			
            //Move image file to new destination

			
			File DestFile=new File("D:\\Screen.png");

            //Copy file at destination

			FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), DestFile);
			System.out.println("screenshot captured");
			driver.quit();

			
			
			// forward command

			driver.navigate().forward();
			
			// back command
			
			driver.navigate().back();
			
			
			// Refersh command 
			driver.navigate().refresh();
			
			
			
			
			
			
			
			
			
				
			
			
			
		}
		 
			
	
	
	
	

}
