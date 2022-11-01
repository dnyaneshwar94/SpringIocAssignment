package com.yash.springioc.que4;

public class SetterMessage
{
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void show()
	{
		System.out.println("Setter Method Message called = "+message);
	}
	
	

}
