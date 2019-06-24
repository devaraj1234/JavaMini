public class ProjectTest{
	public static void main(String[] args){
		// Create projects in different ways
		Project project = new Project();
		Project project2 = new Project("second project");
		Project project3 = new Project("Third project", "This is our third project");
		Project project4 = new Project("Forth project", 20000, "The initial cost of this project is very high");

		// creates a new portfolio
		Portfolio portfolio = new Portfolio();

		// Set the name, description, and initialCost of the first project created
		project.setName("First project");
		project.setDescription("This is our awesome project");
		project.setInitialCost(500);

		// Print the name and descript of project3
		// System.out.println(project3.getName());
		// System.out.println(project3.getDescription());

		// Print the information of all the projects
		project.elevatorPitch();
		project2.elevatorPitch();
		project3.elevatorPitch();
		project4.elevatorPitch();

		//add all four projects to the portfolio
		portfolio.addProject(project);
		portfolio.addProject(project2);
		portfolio.addProject(project3);
		portfolio.addProject(project4);

		//shows info of all projects in portfolio and the porfolios total cost
        portfolio.showPortfolio();

		
	}
}


