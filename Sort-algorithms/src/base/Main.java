package base;

public class Main {

	public static void main(String[] args) {
		Integer[] array = {4,1,3,0,9,7,2};
		
		MergeSort ms = new MergeSort();
		
		array=ms.sorting(array,0,array.length);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
