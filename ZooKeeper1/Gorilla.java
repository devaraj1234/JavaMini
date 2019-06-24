public class Gorilla extends Mammal{
	public void throwSomething(){
		System.out.println("The Gorilla throws something to you!");
		energyLevel -= 5;
	}
	public void eatBananas(){
	 	System.out.println("The Gorilla eat bananas!");
	 	energyLevel += 10;
	}

	public void climb(){
		System.out.println("The Gorilla is climbing the tree!");
		energyLevel -= 10;
	}
}