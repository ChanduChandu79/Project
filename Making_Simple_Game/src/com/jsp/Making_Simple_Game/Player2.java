package com.jsp.Making_Simple_Game;

public class Player2 extends Player1 {
	private int health;
	private boolean armour;
	public Player2(String name, String weapon, int health,  boolean armour) {
		super(name, weapon, health);
		this.health = health;
		this.armour = armour;
	}
	@Override
	public void damageByGun1() {//open method
		if(armour) {//Open Outside if
			this.health -=20;
			if(this.health <=0) {//Open Inside If
				this.health=0;
			}//Closed Inside if
			else {//Open Inside else 
			System.out.println("Armour is on. Got hit by Gun 1.Healthis reduced by 20"
			                   +"new Health is"+this.health);
			}//Closed Inside else
		}//Closed Outside If
		if(!armour) {//Open Outside if
			this.health -=30;
			if(this.health <=0) {//Open Inside If
				this.health=0;
			}//Closed Inside if
			else {//Open Inside else 
			System.out.println("Armour is Off. Got hit by Gun 1.Healthis reduced by 30"
			                   +"new Health is"+this.health);
		}//Closed Inside else
		}//Closed Outside If
		if(this.health==0) {//Open if condition
			System.out.println(getName()+" is dead");
		}//Closed if condition
		
	}// closed method
	
	
	@Override
	public void damageByGun2() {//open method
		if(armour) {//Open Outside if
			this.health -=40;
			if(this.health <=0) {//Open Inside If
				this.health=0;
			}//Closed Inside if
			else {//Open Inside else 
			System.out.println("Armour is off. Got hit by Gun 1.Healthis reduced by 40"
			                   +"new Health is"+this.health);
			}//Closed Inside else
		}//Closed Outside If
		if(!armour) {//Open Outside if
			this.health -=50;
			if(this.health <=0) {//Open Inside If
				this.health=0;
			}//Closed Inside if
			else {//Open Inside else 
			System.out.println("Armour is off. Got hit by Gun 1.Healthis reduced by 50"
			                   +"new Health is"+this.health);
		}//Closed Inside else
		}//Closed Outside If
		if(this.health==0) {//Open if condition
			System.out.println(getName()+" is dead");
		}//Closed if condition
		
		
	}// closed method

	public void heal() {// Open the method
		if(this.health <=0) {//open if 
			System.out.println("Player is dead Heal nOT Possible");
			
		}// closed if
		else {// open else
			this.health=100;
			System.out.println("This Health"+this.health);
		}//close else
	}//closed method

}
