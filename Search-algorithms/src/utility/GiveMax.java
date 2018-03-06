package utility;

public class GiveMax {
	public static Integer findMax(Integer[] Array) {
		Integer max = Array[0];

		for (int i = 1; i < Array.length; i++) {
			if (max < Array[i]){
				max = Array[i];
				}
		}
		return max;
	}
}
