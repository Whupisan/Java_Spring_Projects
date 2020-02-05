
public class Bat extends Mammal{
	private int energyLevel;
	
	// Constructor
	public Bat(int energy) {
		super(energy);
		this.energyLevel = energy;
	}

	// Getters and Setters
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	// Methods
	public Bat eatHumans() {
		this.setEnergyLevel(energyLevel + 25);
		return this;
	}
	
	public Bat attackTown() {
		System.out.println("...the sound of a town on fire...");
		this.setEnergyLevel(energyLevel - 100);
		return this;
	}
	
	public Bat fly() {
		System.out.println("...the sound of bat wings in the distance...");
		this.setEnergyLevel(energyLevel - 50);
		return this;
	}
	
	public void energize(energyTracker target) {
		int energy = target.getEnergyLevel();
		target.setEnergyLevel(energy + 100);
	}
	
	
	
}
