package com.yash.springioc.que3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructor 
{
	public static void main(String[] s)
	{
		ApplicationContext ap= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ConstructorMessage msg=(ConstructorMessage) ap.getBean("constMsg");
		
		msg.show();
		
		
		
	}

}
