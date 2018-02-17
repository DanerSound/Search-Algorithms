package base;

public class QuicksortV1 extends SorterAlgorithm{
	
	private void swap(Integer a,Integer b){
		Integer tmp;
		tmp=a;
		a=b;
		b=tmp;
	}
	
	private Integer partition(Integer[] currentArray, Integer first, Integer last){
		
		Integer pivot=currentArray[last-1];
		Integer pivotIndex=first-1;
		
		for(Integer j=first;j<=last-1;j++) {
			if(currentArray[j]<pivot){
				pivotIndex=pivotIndex+1;
				swap(currentArray[pivotIndex], currentArray[j]);
			}else
			swap(currentArray[pivotIndex], currentArray[currentArray.length-1]);
		}
		return pivotIndex;
	}
	

	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered, Integer firstElement, Integer lastElement) {
		Integer index;
		if(lastElement>firstElement){
			index=partition(arrayToBeOrdered,firstElement,lastElement);
			sorting(arrayToBeOrdered, firstElement, index-1);
			sorting(arrayToBeOrdered, index+1, arrayToBeOrdered.length);
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
