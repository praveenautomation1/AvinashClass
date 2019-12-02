import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\APIs\\c5\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElementByXPath("//input[@name='q']").sendKeys("selenium");
		Thread.sleep(3000);
		WebElement e=driver.findElement(By.xpath("//span"));
	WebElement ul= driver.findElementByClassName("sbl1");
	
	List<WebElement> lic=ul.findElements(By.tagName("span"));
	// using iterator object
	Iterator<WebElement> i=lic.iterator();
	while(i.hasNext()) 
	{   
		Thread.sleep(3000);
	   WebElement LiI = i.next();   
	String data=LiI.findElement(By.xpath("//div[@class='sbl1']/span/b")).getText();

	if(data.equals("selenium")) {
		System.out.println(data);
	LiI.click();
	break;
	}
	}

	}	

}
