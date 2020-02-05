
public class BatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bat benny = new Bat(300);
//		benny.displayEnergy();
//		benny.attackTown().eatHumans().eatHumans().fly();
//		benny.displayEnergy();
		Gorilla alex = new Gorilla(200);
		alex.displayEnergy();
		benny.energize(alex);
		alex.displayEnergy();
	}

}
