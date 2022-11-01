package com.yash.springioc.que4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSetter 
{
	public static void main(String[] s)
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SetterMessage settermessage=(SetterMessage) ap.getBean("setterMsg");
		
		settermessage.show();
	}

}
