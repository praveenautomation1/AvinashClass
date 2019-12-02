package JavaIOExamples;

import java.io.File;
import java.io.IOException;

public class Ex {

	
	// File Class
	
	/*By using File Class we can do below activities 
	
	1. Create Folder
	2. Create files & delete files 
	3. Verify file existency 
	4. Verify file readable, writable, executable or not .. etc...
	
	
	
	*/
public static void main(String[] args) throws Exception {
		
File x = new File("D:\\naveen.xls");

if(!(x.exists())){
	
	
	x.createNewFile();
}

if(x.exists())
{
	
System.out.println("file exists");
}


// to print absolute path 

System.out.println(x.getAbsolutePath());

// to delete files 
x.delete();



}
	
}
