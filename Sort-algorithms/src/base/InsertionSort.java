package base;

public class InsertionSort extends SorterAlgorithm {

	/**
	 * This method orders the input array given, using the Counting sort algorithm.
	 * 
	 * @author Andre Cristhian (DanerSound)
	 * @author Gabriele Puliti (Wabri)
	 * @param arrayToBeOrdered
	 *            messy array
	 * @return array ordered
	 */
	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered) {
		return sorting(arrayToBeOrdered, 0, arrayToBeOrdered.length - 1);
	}

	/**
	 * This method orders a sub-portion of the input array given the indexes of the
	 * range, using the Counting sort algorithm.
	 * 
	 * @author Andre Cristhian (DanerSound)
	 * @author Gabriele Puliti (Wabri)
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
