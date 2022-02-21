// Yei Thek Wang
public class ArraySum {

	/**
	 * No-argument constructor
	 */
	public ArraySum() {
	}

	/**
	 * This method recursively calculates the sum of array elements from last index.
	 * 
	 * @param a:     array of type Integer that is specified in the driver
	 * @param index: integer that shows which number in the array to sum next.
	 * @return sum of array elements
	 */
	public int sumOfArray(Integer[] a, int index) {
		if (index < 0) {
			return 0;
		} else {
			return a[index] + sumOfArray(a, index - 1);
		}
	}

}