import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Awtexample {
	
	public static void main(String[] args) throws AWTException {
		
		// Robot Class- By using Robot class we can execute keyboard events and mouse events
		
		// StringSelection  Using it we can load any file or image
		
		// ToolKit By using Toolkit we can focus on desktop and we can set content 
		
		// KeyEvent  under KeyEvent we have keyboard actions 
		
		// MouseEvent under mousevent we have mouse actions 
		
		// Create object for Robot Class

		Robot rt = new Robot();
		
		// Load image path/ any file
		
		StringSelection ss = new StringSelection("C:\\Users\\NAVEEN\\Pictures\\html table.png");
		
		
// set image path to default window 
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		rt.delay(1000);
		
		// rt.keyPress(keycode)
		
		// pressing ctrl+v
		
		
		
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_V);
		
		// releasing v and ctrl
		
		rt.keyRelease(KeyEvent.VK_V);
		rt.keyRelease(KeyEvent.VK_CONTROL);
		
		// optional 
		
		rt.keyPress(KeyEvent.VK_TAB);
		rt.keyRelease(KeyEvent.VK_TAB);
		rt.delay(2000);
		
		
		
		rt.keyPress(KeyEvent.VK_TAB);
rt.keyRelease(KeyEvent.VK_TAB);		
		
		
		
		
		//------------
rt.delay(1000);
		
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.delay(2000);
		rt.keyRelease(KeyEvent.VK_ENTER);
		
		rt.delay(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
