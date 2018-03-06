package base;

public class QuicksortV1 extends SorterAlgorithm{
	
	private Integer[] swap(Integer index_i,Integer index_j,Integer[] current){
		
		Integer tmp=current[index_i];
		current[index_i]=current[index_j];
		current[index_j]=tmp;
		return current;
	}
	
	private Integer partition(Integer[] currentArray, Integer first, Integer last){
		
		Integer pivot=currentArray[last];
		Integer pivotIndex=first-1;
		
		for(Integer j=first;j<last;j++) {
			if(currentArray[j]<pivot){
				pivotIndex=pivotIndex+1;
				currentArray=swap(pivotIndex,j,currentArray);
			}
		}
		currentArray=swap(pivotIndex+1,last,currentArray);
		return pivotIndex+1;
	}
	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered, Integer firstElement, Integer lastElement) {
		 
		if(lastElement>firstElement){
			Integer index=partition(arrayToBeOrdered,firstElement,lastElement-1);
			arrayToBeOrdered=sorting(arrayToBeOrdered, firstElement, index-1);
			arrayToBeOrdered=sorting(arrayToBeOrdered, index+1, lastElement);
		}
		return arrayToBeOrdered;
	}
	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered) {
		return sorting(arrayToBeOrdered,0,arrayToBeOrdered.length-1);
	}
}
