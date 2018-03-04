package base;

public class BubblesortFlaged extends SorterAlgorithm {

	/**
	 * it will order the array v not view
	 * 
	 * @param Integer[] messy array
	 * 
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

	@Override
	public Integer[] sorting(Integer[] v, Integer maxValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered, Integer firstElement, Integer lastElement) {
		// TODO Auto-generated method stub
		return null;
	}
}
