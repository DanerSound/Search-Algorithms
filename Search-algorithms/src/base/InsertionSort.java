package base;

public class InsertionSort {
	
	static int i, j, max;

	static void sorting(int[] v) {
		for (i = 1; i < v.length; i++) {
			max = v[i];
			j = i;
			while (j - 1 >= 0 && v[j - 1] > max) {
				v[j] = v[j - 1];
				j = j - 1;
			}
			v[j] = max;
		}
	}
}
