package base;

public class BubblesortFlaged extends SorterAlgorithm {

	/**
	 * it will order the array v not view
	 * 
	 * @param Integer[]
	 *            messy array
	 * 
	 */
	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered) {
		return sorting(arrayToBeOrdered,0,arrayToBeOrdered.length-1);
	}

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
