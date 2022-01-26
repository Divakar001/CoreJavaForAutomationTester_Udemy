package coreJava;

public class Constructor_Example {
	// Default
	public Constructor_Example()
		{
		System.out.println(" I am in the constructor");
		System.out.println(" I am in the constructor lecture 1");
	
		//
		}
	
	
	// Parameterized constructor

	public Constructor_Example(int a, int b)
		{
		System.out.println(" I am in the parameterized constructor");
		int c=a+b;
		System.out.println(c);
	
		}

	public Constructor_Example(String str)
		{
		System.out.println(str);
	
		}
	public void getdata()
		{
	
		System.out.println("I am the method");
		}

	//will not return values
	//name of constructor should be the class name
	public static void main(String[] args) {
		
			Constructor_Example cd= new Constructor_Example();
			Constructor_Example cds= new Constructor_Example("hello");
			Constructor_Example c= new Constructor_Example(4,5);
			//Constructor_Example gd= new Constructor_Example();
			
		
		
		// compiler will call implict constructor if you have not defined constructor block
		//when ever you create an object constructor is called
		//block of code when ever an object is created
		}

		}
		
		
		
	