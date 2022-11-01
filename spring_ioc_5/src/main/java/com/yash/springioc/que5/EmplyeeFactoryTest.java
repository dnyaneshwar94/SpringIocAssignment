package com.yash.springioc.que5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmplyeeFactoryTest
{
	public static void main(String[] args) 
	{
		ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee empO= (Employee) objAC.getBean("objEmp");
		empO.employee();
		
	}

}
