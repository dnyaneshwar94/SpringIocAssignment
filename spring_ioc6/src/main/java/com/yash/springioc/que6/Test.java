package com.yash.springioc.que6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String[] args) 
	{
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		System.out.println("Four Wheelers \n");
		Vehicle vehicle = (Vehicle)appContext.getBean("vehicle1");
		vehicle.display();
		
		Vehicle vehicle2 = (Vehicle)appContext.getBean("vehicle2");
		vehicle2.display();
		System.out.println();
		System.out.println("Two Wheelers \n");
		
		Vehicle vehicle3 = (Vehicle)appContext.getBean("vehicle3");
		vehicle3.display();

	}

}
