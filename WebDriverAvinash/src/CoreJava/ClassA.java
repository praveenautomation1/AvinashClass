package CoreJava;

import org.openqa.selenium.WebDriver;

public class ClassA {

	// default constructor 
	
	
	public ClassA(){
		
		System.out.println("default constructor");
		
	}
	
	
	
	// parameterised construtor
	
	public ClassA(String x){
		
		System.out.println(x);
	}
	
	
	// Parameterised constructor
	
	public ClassA(WebDriver x){
		
		System.out.println(x);
		
	}
	
	
}
