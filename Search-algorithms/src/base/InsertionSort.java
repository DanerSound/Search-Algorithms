package base;

public class InsertionSort extends SorterAlgorithm {
	
	/**
	 * Returns an ordered array of integer elements
	 * 
	 * @param Integer[] messy array
	 * @return Integer[] array ordered
	 */
	@Override
	public Integer[] sorting(Integer[] v) {
		for (int i = 1; i < v.length; i++) {
			int max = v[i];
			int j = i;
			while (j - 1 >= 0 && v[j - 1] > max) {
				v[j] = v[j - 1];
				j = j - 1;
			}
			v[j] = max;
		}
		return v;
	}
}
