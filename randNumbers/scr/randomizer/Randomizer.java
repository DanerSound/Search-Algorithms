package randomizer;

import java.util.Random;

public class Randomizer {

	public static Integer[] randomizerIntegerArray(int arrayLenght, int randomRange) {
		Random rand = new Random(System.currentTimeMillis());
		Integer[] array = new Integer[arrayLenght];
		for (int i = 0; i < arrayLenght; i++) {
			array[i] = (Integer) rand.nextInt(randomRange);
		}
		return array;
	}

}
