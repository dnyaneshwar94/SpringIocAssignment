package com.yash.springioc.que3;

public class ConstructorMessage 
{
	private String message=null;

	public ConstructorMessage(String message) {
		super();
		this.message = message;
	}
	
	public void show()
	{
		System.out.println("Constructor Message = "+message);
	}
	
	
	

}
