import java.util.ArrayList;

public class BasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcs neet = new Calcs();
		int[] array = {1,3,15,7,9, 13};
		ArrayList<Integer> results = neet.oddArray();
		System.out.printf("The new array: " +results);
	}
}
