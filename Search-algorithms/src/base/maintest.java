package base;

public class maintest {

	public static void main(String[] args) {
		
		Integer [] v= {20,25,7,3,30,6};
		
		QuicksortV1 qs = new QuicksortV1();
		
		qs.sorting(v,1,v.length);
		
		for(int i=0;i<v.length;i++) {
		System.out.print(" " +v[i]);
		}
		
	}

}
