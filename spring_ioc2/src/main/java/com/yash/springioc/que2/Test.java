package com.yash.springioc.que2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main( String[] args )
    {
       ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
       
       Rectangle r = (Rectangle) appContext.getBean("rectangle");
       r.draw();
       
       Triangle t = (Triangle) appContext.getBean("triangle");
       t.draw();
       
       Parallelogram p = (Parallelogram) appContext.getBean("parallelogram");
       p.draw();
    }

}
