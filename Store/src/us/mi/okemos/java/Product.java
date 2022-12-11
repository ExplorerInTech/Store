package us.mi.okemos.java;

import us.mi.okemos.java.vegetables.Vegetable;

public class Product {
	
	protected boolean isFresh;
	
	protected boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	boolean hasBarCode;
	
	public String getBarCode() {
		return "This is the barcode";
	}
	
	public String ifNotFresh(boolean isFresh) {
		if(isFresh)
			return "keep it";
		else
			return "throw away";
	}
	
	public void checkStorePolicy(Vegetable vegetable) {
		System.out.println(vegetable.ifNotFresh(vegetable.isFresh()));
	}

}
