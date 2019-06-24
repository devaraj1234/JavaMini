package object_master_1;

public class Human {
	public int strength;
	public int stealth;
	public int intelligence;
	public int health;
	
	public Human() {
		strength = 3;
		stealth = 3;
		intelligence = 3;
		health = 100;
	}
	
	public Human attack(Human attacked) {
		attacked.health -= this.strength;
		return attacked;
	}
	
	public void displayHealth() {
		System.out.println("\nHealth Status: " + this.health);
	}
}
