package object_master_2;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        Human player1 = new Human();
	        Human player2 = new Human();
//	        player1.setStrength(10);
//	        player2.setIntelligence(4);
	        player2.attack(player1);
	        System.out.println("Player2 Health: " + player2.getHealth());
	        System.out.println("Player1 Strength: " + player1.getStrength());
	        System.out.println("Player2 Intelligence: " + player2.getIntelligence());
	        System.out.println("Player1 Health: " + player1.getHealth());
	        
	        Wizard wizard = new Wizard();
	        Ninja ninja = new Ninja();
	        Samurai samurai = new Samurai();
	        Samurai samurai2 = new Samurai();
	        
	        wizard.fireball(samurai);
	        System.out.println("Samurai Health: " + samurai.getHealth());
	        
	        ninja.steal(samurai2);
	        System.out.println("Samurai2 Health: " + samurai2.getHealth());
	        
	        samurai.deathBlow(ninja);
	        System.out.println("Ninja Health: " + ninja.getHealth());
	        System.out.println("Samurai Health: " + samurai.getHealth());
	        
	        wizard.heal(ninja);
	        System.out.println("Ninja Health: " + ninja.getHealth());
	        
	        ninja.runAway(player1);
	        System.out.println("Ninja Health: " + ninja.getHealth());
	        
	        samurai.meditate();
	        System.out.println("Samurai Health: " + samurai.getHealth());
	        
	        samurai.howMany();
	        System.out.println("Samurai is: " + samurai2.howMany());
	}

}
