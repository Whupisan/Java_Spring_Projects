
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
	public int throwSomething() {
		System.out.printf("%s has thrown something\n", this.getName());
		this.setEnergyLevel(energyLevel-5);
		return energyLevel;
	}

	public int climb() {
		System.out.printf("%s is now climbing.\n", this.getName());
		this.setEnergyLevel(energyLevel-10);
		return energyLevel;
	}	

	public int eatBananas() {
		System.out.printf("%s is now eating a banana.\n", this.getName());
		int currentHealth = energyLevel +10;
		this.setEnergyLevel(currentHealth);
		return energyLevel;
	}	
}
