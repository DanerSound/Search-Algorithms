package base;

public class SelectionSort extends SorterAlgorithm {

	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered) {
		return sorting(arrayToBeOrdered, 0, arrayToBeOrdered.length - 1);
	}

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
