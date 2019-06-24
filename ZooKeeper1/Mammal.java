public class Mammal{
	protected int energyLevel;
	public Mammal(){
		energyLevel = 100;

	}
	public Integer displayEnergy(){
		System.out.println("Energy Level: " + energyLevel);
		return energyLevel;
	}
}