package object_master_2;

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
	
	public int getStrength() {
		return strength;
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public int getStealth() {
		return stealth;
	}
	
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	
	public int getIntelligence() {
        return intelligence;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
	
	
}
