package com.jsp.pizza;

public class Pizza {
	private double price;
	
	private Boolean veg;
	
	
	private double extraCheesePrice=100.00;
	
	
	private double extraToppingAdded=150.00;
	
	private double backPackPrice=20.00;
	
	
	private double basePizzaPrice;
	
	
	private boolean isExatraCheeseAdded=false;
	
	private boolean isExtraToppingAdded=false;
	
	private boolean isOptedForTakeAway=false;
	
	
	
	
	
     public Pizza(Boolean veg) {
    	 this.veg=veg;
    	 if(this.veg) {
    		 this.price=300;
    		 System.out.println("veg Pizza");
    	 }
    	 else {
    		 this.price=400;
    		 System.out.println("Non veg Pizza");
    	 }
    	 basePizzaPrice=this.price;
    	
     }
    public void addExtraCheese() {
    	isExatraCheeseAdded=true;
    	//System.out.println("Extra cheese added");
    	this.price+=extraCheesePrice;
    	
    	
    }
    public void addExtraTopping() {
    	isExtraToppingAdded=true;
    	//System.out.println("Extra Topping Added");
    	this.price+=extraToppingAdded;
    	
    }
    public void takeway() {
    	isOptedForTakeAway=true;
    	//System.out.println("Take away opted");
    	this.price+=backPackPrice;
    	
    	
    }
    
    public void getbill() {
    	String bill="";
    	
    	System.out.println("Pizza: "+basePizzaPrice);
    	if(isExatraCheeseAdded) {
    		bill +="Extra Cheesee Added: "+extraCheesePrice+"\n" ;

    	}
    	 if(isExtraToppingAdded) {
    		bill += "Extra Topping Added: "+extraToppingAdded+"\n";
    	
    		
    	}
    	 if(isOptedForTakeAway) {
    		bill +="Take Away: "+backPackPrice +"\n";
   
    		
    	}
    	bill+="Bill: "+this.price+"\n";
    	System.out.println(bill);
    	
    	
    	
    }
}
