package base;

public class Bubblesort extends SorterAlgorithm {

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

	@Override
	public Integer[] sorting(Integer[] v, Integer[] b, Integer maxValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered, Integer firstElement, Integer lastElement) {
		// TODO Auto-generated method stub
		return null;
	}
}
