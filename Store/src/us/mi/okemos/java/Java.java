package us.mi.okemos.java;

import us.mi.okemos.java.rice.Rice;
import us.mi.okemos.java.vegetables.Vegetable;

public class Java {
	
	static String storeName;

	public static String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		Java.storeName = storeName;
	}
	
	static {
		/** var initialization name = ""; **/
		System.out.println("Inside store static block");
	}
	
	static {
		System.out.println("Inside store static block2");
	}
	
	public String getStoreThings() {
//		Vegetable broccoli = new Vegetable();
//		broccoli.setName("broccoli");
		
		Vegetable potato = new Vegetable();
		potato.setName("potato");
		potato.setFresh(false);
		potato.checkStorePolicy(potato);
		potato.isFresh();
		
		Rice rice= new Rice();
		rice.isFresh();

		return potato.getName();
	}
	
	
	
	
	
	

}
