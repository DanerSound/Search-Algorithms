package base;

public class mainTest {

	public static void main(String[] args) {
		
		Integer []v= {2,5,3,0,2,3,0,3};
		Integer []B= new Integer[v.length];
		
		Counting_sort cs = new Counting_sort();
		cs.sorting(v, B, 5);
		
		for(int i=0;i<B.length;i++) {
			System.out.print(" "+B[i]);
		}
		

	}

}
