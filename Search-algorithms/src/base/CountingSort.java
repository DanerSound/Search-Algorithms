package base;

import java.util.Arrays;

import utility.*;

public class CountingSort extends SorterAlgorithm {

	public Integer[] sorting(Integer[] arrayToBeOrdered) {
		Integer maxValue = MathTools.findMax(arrayToBeOrdered);

		int[] supp = new int[maxValue + 1];
		Integer[] OrderArray = new Integer[arrayToBeOrdered.length];

		for (int i = 0; i < maxValue; i++)
			supp[i] = 0;

		for (int j = 0; j < arrayToBeOrdered.length; j++)
			supp[arrayToBeOrdered[j]] = supp[arrayToBeOrdered[j]] + 1;

		for (int i = 1; i < supp.length; i++)
			supp[i] = supp[i] + supp[i - 1];

		for (int j = arrayToBeOrdered.length - 1; j >= 0; j--) { // effective sorting
			OrderArray[supp[arrayToBeOrdered[j]] - 1] = arrayToBeOrdered[j];
			supp[arrayToBeOrdered[j]] = supp[arrayToBeOrdered[j]] - 1;
		}
		return OrderArray;
	}

	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered, Integer firstElement, Integer lastElement) {
		Integer[] narrowArray = Arrays.copyOfRange(arrayToBeOrdered, firstElement, lastElement + 1);
		narrowArray = sorting(narrowArray);
		for (int i = firstElement; i < lastElement + 1; i++) {
			arrayToBeOrdered[i] = narrowArray[i - firstElement];
		}
		return arrayToBeOrdered;
	}
}
