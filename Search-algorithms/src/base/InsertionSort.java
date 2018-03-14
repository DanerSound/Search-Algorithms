package base;

public class InsertionSort extends SorterAlgorithm {

	/**
	 * This method orders the input array given, using the Counting sort algorithm.
	 * 
	 * @author Andre Cristhian (DanerSound)
	 * @param arrayToBeOrdered
	 *            messy array
	 * @return array ordered
	 */
	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered) {
		for (int i = 1; i < arrayToBeOrdered.length; i++) {
			int max = arrayToBeOrdered[i];
			int j = i;
			while (j - 1 >= 0 && arrayToBeOrdered[j - 1] > max) {
				arrayToBeOrdered[j] = arrayToBeOrdered[j - 1];
				j = j - 1;
			}
			arrayToBeOrdered[j] = max;
		}
		return arrayToBeOrdered;
	}

	/**
	 * This method orders a sub-portion of the input array given the indexes of the
	 * range, using the Counting sort algorithm.
	 * 
	 * @author Andre Cristhian (DanerSound)
	 * @param arrayToBeOrdered
	 *            messy array
	 * @param firstElement
	 *            left extreme of the array
	 * @param lastElement
	 *            right extreme of the array
	 * @return array ordered
	 */
	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered, Integer firstElement, Integer lastElement) {
		return sorting(arrayToBeOrdered);
	}
}
