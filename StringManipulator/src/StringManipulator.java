
public class StringManipulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringManipulatorTest manipulator = new StringManipulatorTest();
		String word = "Hello";
		String subString = "llo";
		String notSubString = "world";
		Integer a = manipulator.getIndexOrNull(word, subString);
		Integer b = manipulator.getIndexOrNull(word, notSubString);
		System.out.println(a); // 2
		System.out.println(b); // null
	}
}