import java.util.Arrays;

public class Hw3 {

	/**
	 * This method receives two arguments, an integer array a and an integer n. It
	 * reverses order of the last n elements in the given array and prints it on the
	 * screen for this use additional parameterize method.
	 * 
	 * @param a int[]
	 * @param n int
	 */

	public static void reverseLastN(int[] a, int n) {
		reverseLastN(a, n, a.length - n, a.length - 1); // Use parameterize method
	}

	/**
	 * Separate method with additional two more parameters low and high. low start
	 * with 0th index and high end with size of array-1 index if n value is grater
	 * than or equal to array length return original array.
	 * 
	 * @param a   int[]
	 * @param n    int
	 * @param low  int
	 * @param high int
	 * @return
	 */

	public static int[] reverseLastN(int[] a, int n, int low, int high) {

		if (n >= a.length) {
			System.out.println("\n Orignal array is return because value of n is grater than the array length!");
		}
		// Below logic is for swap last n elements of the array.
		if (low < high) {
			int temp = a[low];
			a[low] = a[high];
			a[high] = temp;

			return reverseLastN(a, n, low + 1, high - 1); // Recursively invoked method.
		}
		return a;
	}

	/**
	 * Inside given array minimum value is 5 so user enter less than 5 doesn't need
	 * to compare bcz order is not matter.Same way value which is > 48 for that then
	 * there is no need for swapping element bcz order is not matter.
	 * 
	 * @param a int[]
	 * @param x int
	 */
	public static void rearrange(int[] a, int x) {

		if (x < 5 || x > 48) {
			return;
		} else {
			rearrange(a, x, 0, a.length - 1); // Use parameterize method
		}
	}
//---------------------------------------------------------------------------------------------------------------------

	public static int[] rearrange(int[] a, int x, int lb, int ub) {
		int low = lb;
		int high = ub;

		if (low <= high) {
			if (a[low] < x) {
				return rearrange(a, x, low + 1, high);
			} else if (a[high] > x) {
				return rearrange(a, x, low, high - 1);
			}
			// logic for swapping array element
			int temp1 = a[low];
			a[low] = a[high];
			a[high] = temp1;
			low++;
			high--;
		}

		if (lb < high)
			return rearrange(a, x, lb, high);

		if (ub > low)
			return rearrange(a, x, high, ub);

		return a;
	}

	public static void main(String[] args) {
		int[] a = new int[10];

		System.out.println("Test reverseLastN method");
		for (int i = 0; i < a.length; i++) {
			a[i] = (i + 1) * 10;
		}

		System.out.println("\nInitial array: ");
		System.out.println(Arrays.toString(a));

		// make a copy and use it for testing
		int[] intArrayCopy;
		intArrayCopy = a.clone();

		int N = 4;
		reverseLastN(intArrayCopy, N);
		System.out.println("\nAfter reversing last " + N + " elements: ");
		System.out.println(Arrays.toString(intArrayCopy));
		System.out.println();

		// test rearrange method
		System.out.println("\nTest rearrange method");
		int[] b = { 31, 8, 23, 29, 12, 48, 36, 5, 39 }; // [5, 12, 8, 23, 29, 48, 36, 31, 39]
		System.out.println("\nBefore rearrange: ");
		System.out.println(Arrays.toString(b));

		// make a copy and use it for testing
		intArrayCopy = b.clone();

		int x = 30;
		rearrange(intArrayCopy, x);
		System.out.println("\nAfter rearrange, with x = " + x);
		System.out.println(Arrays.toString(intArrayCopy));
		System.out.println();
	}
}


