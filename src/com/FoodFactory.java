package com;

class FoodFactory{
	
	public Food getFood(String food,int price,String res,int qua){
		Food f = null;

			if(food.equalsIgnoreCase("Pizza")){
				f= new Pizza(price,qua,res);
			}
			else if(food.equalsIgnoreCase("Burger")){
				f= new Burger(price,qua,res);
			}
		
		return f;
		
		
	}
	
}
