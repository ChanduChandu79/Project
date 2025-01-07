package com.jsp.Making_Simple_Game;

public class Main {
	public static void main(String[] args) {
		 Player1 player=new Player1("chandu","sword",100);
		// System.out.println(player.getName());
		// System.out.println(player.getHealth());
		// System.out.println(player.getWeapon());
		 
		 
		// player.damageByGun1();//70
		// player.damageByGun1();//40
		// player.damageByGun1();//10
		// player.damageByGun1();// Its is Dead
		 
//		 player.damageByGun1();
//		 player.damageByGun1();
//		 player.damageByGun2();
		 
		 Player2 player2=new Player2("Nani","machine Gun",100,false);
		 player2.damageByGun1();
	}

}
