package base;

public class Bubblesort extends SorterAlgorithm {

	/**
	 * This method orders the input array given, using the Bubble sort algorithm.
	 * 
	 * @author Andre Cristhian (DanerSound)
	 * @param arrayToBeOrdered
	 *            messy array
	 * @return array ordered
	 */
	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered) {
		for (int i = arrayToBeOrdered.length - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				if (arrayToBeOrdered[j - 1] > arrayToBeOrdered[j]) {
					int tmp = arrayToBeOrdered[j - 1];
					arrayToBeOrdered[j - 1] = arrayToBeOrdered[j];
					arrayToBeOrdered[j] = tmp;
				}
			}
		}
		return arrayToBeOrdered;
	}

	/**
	 * This method orders a sub-portion of the input array given the indexes of the
	 * range, using the Bubble sort algorithm.
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
