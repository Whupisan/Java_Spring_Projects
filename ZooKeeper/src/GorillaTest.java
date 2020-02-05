
public class GorillaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla alex = new Gorilla(200);
		alex.setName("Alex");
		System.out.println(alex.getName());
		
		alex.displayEnergy();
		alex.eatBananas();
		alex.displayEnergy();
		alex.throwSomething();
		alex.displayEnergy();
	}

}
