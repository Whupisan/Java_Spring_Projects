
public class Project4Madame {
	private String name;
	private String description;
	private double initalCost;

	// Constructors with zero, one and two parameters

	public Project4Madame() {
		// TODO Auto-generated constructor stub
	}

	public Project4Madame(String name) {
		this.name = name;
		projectCard(name);
	}

	public Project4Madame(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Project4Madame(String name, String description, double cost) {
		this.name = name;
		this.description = description;
		this.initalCost = cost;
	}
	
	// Getters and Setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getInitalCost() {
		return initalCost;
	}

	public void setInitalCost(double initalCost) {
		this.initalCost = initalCost;
	}

	// Card that has no arguments
	public void projectCard() {
		System.out.println("This is your card.");
	}

	// Card that has one arguments
	public void projectCard(String name) {
		System.out.printf("This is your card. Your name is %s\n", name);
	}

	// Card that has two arguments
	public void projectCard(String name, String description) {
		System.out.printf("Name: %s : Description: %s\n", name, description);
	}

	// Card that has two arguments
	public void projectCard(String name, String description, double cost) {
		System.out.printf("%s ($%.2f): Description: %s", name, cost, description);
	}
}
