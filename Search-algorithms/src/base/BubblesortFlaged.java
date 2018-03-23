package base;

public class BubblesortFlaged extends SorterAlgorithm {

	/**
	 * This method orders the input array given, using the Bubble sort algorithm
	 * with flag.
	 * 
	 * @author Andre Cristhian (DanerSound)
	 * @author Gabriele Puliti (Wabri)
	 * @param arrayToBeOrdered
	 *            messy array
	 * @return array ordered
	 */
	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered) {
		return sorting(arrayToBeOrdered,0,arrayToBeOrdered.length-1);
	}
	
	/**
	 * This method orders a sub-portion of the input array given the indexes of the
	 * range, using the Bubble sort algorithm with flag.
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
		int i = lastElement + 1;
		boolean sorted = false;

		while ((i >= firstElement + 1) && (!sorted)) {
			sorted = true;
			for (int j = firstElement + 1; j < i; j++) {
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
}
