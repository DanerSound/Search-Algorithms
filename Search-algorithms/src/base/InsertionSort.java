package base;

public class InsertionSort extends SorterAlgorithm {

	/**
	 * Returns an ordered array of integer elements
	 * 
	 * @param arrayToBeOrdered
	 *            messy array
	 * @return array ordered
	 */
	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered) {
		return sorting(arrayToBeOrdered, 0, arrayToBeOrdered.length - 1);
	}

	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered, Integer firstElement, Integer lastElement) {
		for (int i = firstElement + 1; i < lastElement + 1; i++) {
			int max = arrayToBeOrdered[i];
			int j = i;
			while (j - 1 >= firstElement && arrayToBeOrdered[j - 1] > max) {
				arrayToBeOrdered[j] = arrayToBeOrdered[j - 1];
				j = j - 1;
			}
			arrayToBeOrdered[j] = max;
		}
		return arrayToBeOrdered;
	}
}
