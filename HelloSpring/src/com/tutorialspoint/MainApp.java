package com.tutorialspoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp 
{

	public static void main(String[] args) 
	{
	      @SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      SomeThing something = (SomeThing) context.getBean("someThing");

	      obj.getMessage();
	      something.getMessage();
	      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

	      objA.setMessage("I'm object A");
	      objA.getMessage();

	      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
	      objB.getMessage();
	      
	      AnyThing objC = (AnyThing) context.getBean("anyThing");

	      objC.setMessage("I'm a prototype");
	      objC.getMessage();

	      AnyThing objD = (AnyThing) context.getBean("anyThing");
	      objD.getMessage();
	      
	      HamEggs objE = (HamEggs) context.getBean("hamEggs");
	      objE.getMessage();
	      
	      PorkBeans objF = (PorkBeans) context.getBean("porkBeans");
	      objF.getMessage();
	      context.registerShutdownHook();	      
	}

}
