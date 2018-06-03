package base;

public class Run {

	public static void main(String[] args) {
		Integer[] v= {1,3,5,10,2,4,6,7,88};
		
		MergeSort ms = new MergeSort();
		
		ms.sorting(v, 0, v.length-1);
		
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}

	}

}
