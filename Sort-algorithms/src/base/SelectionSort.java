package base;

public class SelectionSort extends SorterAlgorithm {

	/**
	 * This method orders the input array given, using the Selection sort algorithm.
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
	 * range, using the Selection sort algorithm.
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
		for (int i = firstElement; i <= lastElement; i++) {
			int min = i;
			for (int j = i + 1; j <= lastElement; j++) {
				if (arrayToBeOrdered[j] < arrayToBeOrdered[min])
					min = j;
			}
			int tmp = arrayToBeOrdered[min];
			arrayToBeOrdered[min] = arrayToBeOrdered[i];
			arrayToBeOrdered[i] = tmp;
		}
		return arrayToBeOrdered;
	}

}
