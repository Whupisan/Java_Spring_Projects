
public class Project4MadameTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project4Madame urCard = new Project4Madame();
		urCard.setName("Betsy");
		urCard.setDescription("Ample Weave Sculptor");
		urCard.setInitalCost(35.87);
		urCard.projectCard();
		urCard.projectCard(urCard.getName());
		urCard.projectCard(urCard.getName(), urCard.getDescription());
		urCard.projectCard(urCard.getName(), urCard.getDescription(), urCard.getInitalCost());
	}
}
