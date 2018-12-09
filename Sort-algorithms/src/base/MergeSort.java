package base;

public class MergeSort extends SorterAlgorithm {

	/**
	 * This method orders the input array given, using the Merge sort algorithm.
	 * 
	 * @author Andre Cristhian (DanerSound)
	 * @author Gabriele Puliti (Wabri)
	 * @param arrayToBeOrdered
	 *            messy array
	 * @return array ordered
	 */
	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered) {
		return null;
	}

	/**
	 * This method orders a sub-portion of the input array given the indexes of the
	 * range, using the Merge sort algorithm.
	 * 
	 * @author Andre Cristhian (DanerSound)
	 * @author Gabriele Puliti (Wabri)
	 * @param arrayToBeOrdered
	 *            messy array
	 * @param firstIndex
	 *            left extreme of the array
	 * @param lastIndex
	 *            right extreme of the array
	 * @return array ordered
	 */

	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered, Integer firstIndex, Integer lastIndex) {
		if (lastIndex - firstIndex > 0) {
			int midIndex = (lastIndex + firstIndex) / 2;
			arrayToBeOrdered = sorting(arrayToBeOrdered, firstIndex, midIndex);
			arrayToBeOrdered = sorting(arrayToBeOrdered, midIndex + 1, lastIndex);

			Integer[] support = new Integer[lastIndex];

			for (Integer i = 0; i <= midIndex; i++) {
				support[i] = arrayToBeOrdered[i];
			}
			for (Integer j = midIndex + 1; j < lastIndex; j++) {
				support[lastIndex + midIndex + 1 - j] = arrayToBeOrdered[j];
			}

			for (Integer index = 0; index < lastIndex; index++) {
				if (support[firstIndex] < support[lastIndex]) {
					arrayToBeOrdered[index] = support[firstIndex];
					firstIndex++;
				} else {
					arrayToBeOrdered[index] = support[lastIndex];
					lastIndex--;
				}
			}
		}
		return arrayToBeOrdered;
	}

}
