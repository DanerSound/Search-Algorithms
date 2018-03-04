package base;

public class Counting_sort extends SorterAlgorithm {

	@Override
	public Integer[] sorting(Integer[] arrayToBeOrder, Integer maxValue ){
		int[] supp = new int[maxValue+1];
		Integer[] OrderArray= new Integer[arrayToBeOrder.length];
		
		for(int  i=0;i<maxValue;i++)
			supp[i]=0;		
		
		for(int j=0;j<arrayToBeOrder.length;j++)
			supp[arrayToBeOrder[j]]=supp[arrayToBeOrder[j]]+1;
		
		for(int i=1;i< supp.length;i++)
			supp[i]=supp[i]+supp[i-1];
		
		for(int j=arrayToBeOrder.length-1;j>=0;j--){ // effective  sorting
			OrderArray[supp[arrayToBeOrder[j]]-1]=arrayToBeOrder[j];
			supp[arrayToBeOrder[j]]=supp[arrayToBeOrder[j]]-1;			
		}
		return OrderArray;
	}
	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered, Integer firstElement, Integer lastElement) {
		// TODO Auto-generated method stub
		return null;
	}
}
