package zookeeper2;

public class Bat extends Mammal {
//	public Bat() {
//		energyLevel = 300;
//	}
	public void fly() {
		System.out.println("Whoosh!, Whoosh!");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("Cluck!, Cluck!");
		energyLevel += 100;
	}
	
	public void attackTown() {
		System.out.println("Boom, Boom, AAAAHHHHHHH!");
		energyLevel -= 100;
	}

}
