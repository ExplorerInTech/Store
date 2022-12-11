package us.mi.okemos.java;

import us.mi.okemos.java.vegetables.Vegetable;

public class Java {
	
	static String storeName;

	public static String getStoreName() {
		return storeName;
	}

	public static void setStoreName(String storeName) {
		Java.storeName = storeName;
	}
	
	static {
		/** var initialization name = ""; **/
		System.out.println("Inside store static block");
	}
	
	static {
		System.out.println("Inside store static block2");
	}
	
	public static String getStoreThings() {
		Vegetable broccoli = new Vegetable();
		broccoli.setName("broccoli");
		
		Vegetable potato = new Vegetable();
		potato.setName("potato");
		
		return broccoli.getName() + " " +potato.getName();
	}
	
	
	
	

}
