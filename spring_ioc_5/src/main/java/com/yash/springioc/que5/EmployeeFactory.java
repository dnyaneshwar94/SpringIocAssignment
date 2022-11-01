package com.yash.springioc.que5;

public class EmployeeFactory
{
	public static Employee getEmpCategory()
	{
		return new Manager();
		
	}

}
