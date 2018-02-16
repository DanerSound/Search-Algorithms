package base;

public class SelectionSort extends SorterAlgorithm {
	
	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered) {
		for (int i = 0; i <= arrayToBeOrdered.length - 2; i++) {
			int min = i;
			for (int j = i + 1; j < arrayToBeOrdered.length - 1; j++) {
				if (arrayToBeOrdered[j] < arrayToBeOrdered[min])
					min = j;
			}
			int tmp = arrayToBeOrdered[min];
			arrayToBeOrdered[min] = arrayToBeOrdered[i];
			arrayToBeOrdered[i] = tmp;
		}
		return arrayToBeOrdered;
	}

	@Override
	public Integer[] sorting(Integer[] v, Integer[] b, Integer maxValue) {
		// TODO Auto-generated method stub
		return null;
	}

}
