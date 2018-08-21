import java.util.Arrays;

public class testCopy {

	public static void main(String[] args) {

		Integer[] ints_a = {1, 2, 3, 4, 5};
		Integer[] ints_b = {6, 7, 8, 9, 10};

		System.out.println("First array: ");
		printArray(ints_a);

		System.out.println("Second array: ");
		printArray(ints_b);

		ints_b = Arrays.copyOf(ints_a, ints_a.length);

		System.out.println("Second array: ");
		printArray(ints_b);

		ints_a[0] = 555;		

		System.out.println("First array: ");
		printArray(ints_a);

		System.out.println("Second array: ");
		printArray(ints_b);
		
	}

	public static void printArray(Integer[] anyInts) {
		for(Integer anInt:anyInts) {
			System.out.print(anInt);
		}
		System.out.println("");
	}

}
