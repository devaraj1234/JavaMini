public class Project{
	private String name;
	private String description;
	private double initialCost;
	
	// overloading the constructor with given info
	public Project(){

	}
	public Project(String name){
		this.name = name;
	}

	public Project(String name, String description){
		this.name = name;
		this.description = description;
	}
	public Project(String name, double initialCost, String description){
		this.name = name;
		this.initialCost = initialCost;
		this.description = description;
	}

	//prints info for the Project object
	public void elevatorPitch(){
		System.out.println("Name: "+name+" "+"Initial Cost: "+initialCost+" "+"Description: "+description);
	}
	// sets the project name
	public void setName(String name){
		this.name = name;
	}
	// sets the project description
	public void setDescription(String description){
		this.description = description;
	}
	// set the project initial cost
	public void setInitialCost(double initialCost){
		this.initialCost = initialCost;
	}
	// returns the name of project
	public String getName(){
		return name;
	}
	// returns the desctiption of the project
	public String getDescription(){
		return description;
	}
	// returns the initial cost of the project
	public double getInitialCost(){
		return initialCost;
	}
}