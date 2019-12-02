import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\APIs\\c5\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("http://apps.qaplanet.in//qahrm//login.php");
		
		Thread.sleep(2000);
		
		
		// verify home page 
		
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")){
			
		System.out.println("Home Page Displayed");
			
		}
		
		else
			System.out.println("Failed to display home page");
		
		
		
		// create Webelement for Username, pwd,login and clear. 
		
WebElement	objUN =	driver.findElementByName("txtUserName");
WebElement objPwd = driver.findElementByName("txtPassword");
WebElement objLogin= driver.findElementByName("Submit");
WebElement objClear =driver.findElementByName("clear");
		
	// verify User name
 if(objUN.isDisplayed()){
	 
	 System.out.println("Username is displayed");
	 
 }
 else
 {
	 System.out.println("failed to dispay username");
 }
		
 
	// verify pwd
if(objPwd.isDisplayed()){
	 
	 System.out.println("password is displayed");
	 
}
else
{
	 System.out.println("failed to dispay password");
}
		
 
 
// verify login and clear
if(objLogin.isDisplayed()&&objClear.isDisplayed() ){
	
	System.out.println("login and clear displayed");
}


String sUN = "qaplanet1";
String sPwd = "lab1";


// Login to HRM 

objUN.clear();
objUN.sendKeys(sUN);
objPwd.clear();
objPwd.sendKeys(sPwd);
objLogin.click();

Thread.sleep(2000);

// verify orangeHRM 
if(driver.getTitle().equals("OrangeHRM")){
	
	System.out.println("Orange HRM Displayed");
}

else
 System.out.println("Failed to login");
		
		
	// Get welcome text	
		
		String sWelText = driver.findElementByXPath("//ul[@id='option-menu']/li[1]").getText();
		
// verify welcome text 
		if(sWelText.equals("Welcome "+sUN))
		{
			System.out.println("Welcome"+sUN+"displayed");
		}
		
		
		
// create webelement for logout and change password
		
		
		WebElement objCP = driver.findElementByLinkText("Change Password");
		WebElement objLogout = driver.findElementByLinkText("Logout");
		
		// verify change password and logout 
		if(objCP.isDisplayed()&&objLogout.isDisplayed()){
			System.out.println("change password and logout are displayed successfully");
		}
		
		// click on logout 
		objLogout.click();
		// wait for 2 sec
		Thread.sleep(2000);
		
		
		
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")){
			
			System.out.println("Logout is successful and Home Page Displayed");
				
			}
			
			else
				System.out.println("Failed to display home page");
			
		driver.close();
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
 
 
 
 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
