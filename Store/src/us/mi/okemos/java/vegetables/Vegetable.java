package us.mi.okemos.java.vegetables;

import us.mi.okemos.java.Java;
import us.mi.okemos.java.Product;

public class Vegetable extends Product{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	{
		System.out.println("Vegetable non-static block");
	}
	
	
	
	
	
	
	

}
