
public class Mammal {
	private int energyLevel;

	// Mammal constructor
	public Mammal(int energy) {
		this.energyLevel = energy;
	}
	
	// Getters and Setters
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}


	// Calculating the current energy level
	public int energyLevel() {
			int eLevel = this.getEnergyLevel();
			return eLevel;
		}

	// Displaying and returning the energy level
	public int displayEnergy() {
		int levelNow = energyLevel();
		System.out.printf("Current energy Level: %d.\n", levelNow);
		return levelNow;
	}
}
