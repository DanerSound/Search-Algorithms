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
}
