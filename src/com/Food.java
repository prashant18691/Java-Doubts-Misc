package com;

public abstract class Food{
	
	
	public abstract String getRes();
	public abstract int getPrice();
	public abstract int getQu();
	@Override
	public String toString() {
		return "[Restaurant=" + getRes() + ", Price=" + getPrice() + ", Quantity=" + getQu() + "]";
	}
	
	
}
