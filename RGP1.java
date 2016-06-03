package com.orilore.lxh.test1;

public class RGP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		SwordsMan swordsMan = new SwordsMan();
		
		swordsMan.setName("Justin");
		
		swordsMan.setLevel(1);
		
		swordsMan.setBlood(200);
		
		
		Magician magician = new Magician();
		
		magician.setName("Monica");
		
		magician.setLevel(1);

		magician.setBlood(100);
		
		showBlood(swordsMan);

		showBlood(magician);
		
	}

	/*private static void showBlood(Magician magician) {
		// TODO Auto-generated method stub
		
	}

	private static void showBlood(SwordsMan swordsMan) {
		// TODO Auto-generated method stub
		
	}*/

	private static void showBlood(Magician magician) {
		// TODO Auto-generated method stub
		
	}

	private static void showBlood(SwordsMan swordsMan) {
		// TODO Auto-generated method stub
		
	}

	static void showBlood(Role role){
		
		
		System.out.printf("%s ÑªÁ¿ %µÄ£¬%n", role.getName(),role.getBlood());
		
	}
	
}
