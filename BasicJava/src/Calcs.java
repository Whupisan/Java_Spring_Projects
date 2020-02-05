import java.util.ArrayList;

//Square the values
//Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the array by itself. When the method is done, the array x should have values that have been squared, say [1, 25, 100, 4].

public class Calcs {
	public ArrayList<Integer> square(ArrayList<Integer> array) {
//		ArrayList <Integer> array = new ArrayList<Integer>;
		for (int i = 0; i < array.size(); i++) {
			array.add(i, 2);
		}
		return array;
	}

	public void printAll() {
		for (int i = 1; i <= 255; i++) {
			System.out.println(i);
		}
	}

	public void OddPrint() {
		for (int i = 0; i <= 255; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
	
	public void printSum() {
		int sum = 0;
		for(int i=0; i<=255; i++) {
			sum += i;
			System.out.printf("New number: %d Sum %d\n", i, sum);
		}
	}
	
	int[] array = {1,3,5,7,9,13};
	public void arrIterator(int[] array) {
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum += array[i];
			System.out.printf("When index is %d, the sum is %d\n", i, sum);
		}
	}
	
	public int max(int[] array) {
		int max = array[0];
		for (int i = 1; i< array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	
	public ArrayList<Integer> oddArray() {
		ArrayList<Integer> array = new ArrayList<>();
		for(int i=0; i<=255; i++) {
			if(i%2!=0) {
                array.add(i);
			}
		}
		return array;
	}
	
	public ArrayList<Integer> yYes(int[] array, int y) {
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		for (int i=0; i<array.length; i++) {
			if(y<array[i]) {
				newArray.add(array[i]);
			}
		}
		return newArray;
	}
}
