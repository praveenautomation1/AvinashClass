import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWebTable {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\APIs\\c5\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("http://apps.qaplanet.in//qahrm//login.php");

WebElement	objUN =	driver.findElementByName("txtUserName");
WebElement objPwd = driver.findElementByName("txtPassword");
WebElement objLogin= driver.findElementByName("Submit");
String sUN = "qaplanet1";
String sPwd = "lab1";


// Login to HRM 

objUN.clear();
objUN.sendKeys(sUN);
objPwd.clear();
objPwd.sendKeys(sPwd);
objLogin.click();

		Thread.sleep(2000);
		
driver.switchTo().frame("rightMenu");		

int rc=driver.findElementsByXPath("//table/tbody/tr").size();
		System.out.println("Row Count :"+rc);
		
		
// to get column count 		
		
int colmc=	driver.findElementsByXPath("//table[@class='data-table']/tbody/tr[1]/td").size();	
		// to get cell count
int cellcnt=	driver.findElementsByXPath("//table[@class='data-table']/tbody/tr/td").size();	
	System.out.println(cellcnt);	
// to get cell data

for (int i=1;i<=rc;i++){
	
	for (int j=1;j<colmc;j++){
		
		//to get text from every cell 
		
		String x=driver.findElementByXPath("//table[@class='data-table']/tbody/tr["+i+"]/td["+j+"]").getText();
		System.out.println(x);
		
		
		
		
	}
	
	
	
	
	
	
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
