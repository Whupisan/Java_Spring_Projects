
public class Gorilla extends Mammal {

	private int energyLevel = 200;
	private String name;

	// Gorilla constructor
	public Gorilla(int energyLevel) {
		super(energyLevel);
		this.energyLevel = energyLevel;
	}
	
	// Getters and Setters
		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Methods for the animal
	public Gorilla throwSomething() {
		System.out.printf("%s has thrown something\n", this.getName());
		int currentHealth = this.getEnergyLevel() -5;
		this.setEnergyLevel(currentHealth);
		return this;
	}

	public Gorilla climb() {
		System.out.printf("%s is now climbing.\n", this.getName());
		int currentHealth = this.getEnergyLevel() - 10;
		this.setEnergyLevel(currentHealth);
		return this;
	}	

	public Gorilla eatBananas() {
		System.out.printf("%s is now eating a banana.\n", this.getName());
		int currentHealth = this.getEnergyLevel() + 10;
		this.setEnergyLevel(currentHealth);
		return this;
	}	
}
