package com.jsp.pizza;

public class Mainclass {
	public static void main(String[] args) {
	Pizza p=new Pizza(false);
	    p.addExtraCheese();
		p.addExtraTopping();
     	p.takeway();
		p.getbill();
//		DeluxPizza d=new DeluxPizza(true);
//		d.addExtraCheese();
//		d.addExtraTopping();
//		d.getbill();
	}

}
