package zookeeper2;

public class Mammal {
	protected int energyLevel = 300;
	public Integer displayEnergy() {
		System.out.println("\nRemaining energy level is: "+energyLevel);
		return energyLevel;
	}
}


