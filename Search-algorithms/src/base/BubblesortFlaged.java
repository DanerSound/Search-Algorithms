package base;

public class BubblesortFlaged extends SorterAlgorithm {

	/**
	 * This method orders the input array given, using the Bubble sort algorithm
	 * with flag.
	 * 
	 * @author Andre Cristhian (DanerSound)
	 * @param arrayToBeOrdered
	 *            messy array
	 * @return array ordered
	 */
	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered) {
		int i = arrayToBeOrdered.length;
		boolean sorted = false;

		while ((i >= 1) && (!sorted)) {
			sorted = true;
			for (int j = 1; j < i; j++) {
				if (arrayToBeOrdered[j - 1] > arrayToBeOrdered[j]) {
					int tmp = arrayToBeOrdered[j - 1];
					arrayToBeOrdered[j - 1] = arrayToBeOrdered[j];
					arrayToBeOrdered[j] = tmp;
					sorted = false;
				}
			}
			i = i - 1;
		}
		return arrayToBeOrdered;
	}

	/**
	 * This method orders a sub-portion of the input array given the indexes of the
	 * range, using the Bubble sort algorithm with flag.
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
