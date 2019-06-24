package object_master_2;

public class Ninja extends Human {
	public Ninja() {
		this.stealth = 10;
	}
	
	public Ninja steal(Human target) {
		target.stealth -= this.stealth;
		this.health += this.stealth;
		return this;
	}
	
	public Ninja runAway(Human target) {
		this.health -= 10;
		return this;
	}
	
	

}
