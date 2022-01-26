package coreJava;

public class Inheritance_ChildClass extends Inheritance_ParentClass{

	

String name ="QAClickAcademy";


public Inheritance_ChildClass()
		{
		super();// this should be always be at first line
		System.out.println("child class construtor");
		
		}

public void getStringdata()
		{
		System.out.println(name);
		System.out.println(super.name);
		}


public void getData()

		{
		super.getData();
		System.out.println("I am in child class");
		}


public static void main(String[] args) {

		Inheritance_ChildClass cd = new Inheritance_ChildClass();
		cd.getStringdata();
		cd.getData();
		
}


		
	}


