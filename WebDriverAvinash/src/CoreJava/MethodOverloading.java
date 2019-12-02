package CoreJava;

public class MethodOverloading {


	public void method1()
	{
		
		System.out.println("method1");
	}

	public void method1(int a)
	{
		
		System.out.println(a);
	}


	public void method1(String b)
	{
		
		System.out.println(b);
	}




	public void method1(String a, String b)
	{
		
		System.out.println(a+b);
	}



public static void main(String[] args) {
	
MethodOverloading x = new MethodOverloading();

x.method1();
x.method1(10);
x.method1("method overlading");
x.method1("qa", "planet");

	
}























}
