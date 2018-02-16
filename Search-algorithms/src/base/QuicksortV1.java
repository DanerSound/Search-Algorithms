package base;

public class QuicksortV1 extends SorterAlgorithm{
	
	void swap(Integer a,Integer b){
		Integer tmp;
		tmp=a;
		a=b;
		b=tmp;
	}
	
	Integer partition(Integer[] arrayToBeOrdered, Integer firstElement, Integer lastElement){
		Integer pivot=arrayToBeOrdered[lastElement];
		Integer pivotIndex=firstElement-1;
		
		for(Integer j=firstElement;j<=lastElement-1;j++) {
			if(arrayToBeOrdered[j]<=pivot){
				pivotIndex=pivotIndex+1;
				swap(arrayToBeOrdered[pivotIndex], arrayToBeOrdered[j]);
			}
			swap(pivotIndex, pivot);
		}
		return pivotIndex;
	}
	

	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered, Integer firstElement, Integer lastElement) {
		Integer index;
		if(lastElement>firstElement){
			index=partition(arrayToBeOrdered,firstElement,lastElement);
			sorting(arrayToBeOrdered, firstElement, index-1);
			sorting(arrayToBeOrdered, index+1, lastElement);
		}
		return arrayToBeOrdered;
	}
	
	
	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer[] sorting(Integer[] v, Integer[] b, Integer maxValue) {
		// TODO Auto-generated method stub
		return null;
	}

}
