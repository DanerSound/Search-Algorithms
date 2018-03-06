package base;

public class Test {

	public static void main(String[] args) {
		 
		Integer[] v={2,4,6,1,3,5};
		
		QuicksortV1 qs = new QuicksortV1();
		
		v=qs.sorting(v,0,v.length);
		
		for (int i = 0; i < v.length; i++) {
			System.out.println(" " + v[i]);
		}

	}

}
