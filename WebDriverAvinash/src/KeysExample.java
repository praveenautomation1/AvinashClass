import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysExample {
public static void main(String[] args) {
	
	
	// By using Keys we can perform keyboard operation like Enter,Escape,Function Keys,Num Pad etc.. and shortcuts like ALT+CTRL+DEL..etc..,CTRL+A..etc..
	

	FirefoxDriver driver = new FirefoxDriver();
	
	WebElement E = driver.findElementByName("name");
	
	// -------------
	
	E.sendKeys(Keys.ARROW_DOWN);
	E.sendKeys(Keys.ARROW_LEFT);
	E.sendKeys(Keys.F5);
E.sendKeys(Keys.NUMPAD0);	
// ---------
//to perform multipe operations
	
E.sendKeys(Keys.chord(Keys.CONTROL,"a"));
E.sendKeys(Keys.chord(Keys.ALT,Keys.CONTROL,Keys.DELETE));
E.sendKeys(Keys.chord(Keys.CONTROL,"z"));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
