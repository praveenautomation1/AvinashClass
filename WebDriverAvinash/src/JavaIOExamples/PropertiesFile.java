package JavaIOExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

public static void main(String[] args) throws Exception, IOException {
		
Properties obj = new Properties();		
		
		
obj.load(new FileInputStream("D:\\eclipse\\WebDriverAvinash\\src\\JavaIOExamples\\12.properties"));	


String strURL= obj.getProperty("URL");
System.out.println(strURL);

String strUN= obj.getProperty("username");
System.out.println(strURL);

String strpwd= obj.getProperty("password");
System.out.println(strpwd);







		
	}
	
	
	
	
}
