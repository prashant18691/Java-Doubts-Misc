package com;

public class Burger extends Food{
	


	public Burger(int price, int qu, String res) {
		super();
		this.price = price;
		this.qu = qu;
		this.res = res;
	}

	private int price;
	
	private int qu;
	
	private String res;

	public int getPrice() {
		return price;
	}


	public int getQu() {
		return qu;
	}


	public String getRes() {
		return res;
	}


	

}
