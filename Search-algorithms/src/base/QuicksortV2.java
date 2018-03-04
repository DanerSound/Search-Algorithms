package base;

public class QuicksortV2 extends SorterAlgorithm {
	
	private Integer[] swap(Integer[] current,Integer index_i,Integer index_j){	
		Integer tmp=current[index_i];
		current[index_i]=current[index_j];
		current[index_j]=tmp;
		return current;
	}
	
	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered, Integer firstElement, Integer lastElement) {
		if(lastElement>firstElement){
		  Integer pivot=arrayToBeOrdered[lastElement];
		  Integer left_index=firstElement;
		  Integer right_index=lastElement-1;
		
		while(true){
		  while(arrayToBeOrdered[left_index]<pivot)
			  left_index=left_index+1;
		  while(arrayToBeOrdered[right_index]>pivot)
			  right_index=right_index-1;		  
		  if(left_index>=right_index) break;
		  arrayToBeOrdered=swap(arrayToBeOrdered,left_index,right_index);
		}		
		arrayToBeOrdered=swap(arrayToBeOrdered,left_index,lastElement);	
		arrayToBeOrdered=sorting(arrayToBeOrdered, firstElement, left_index-1);
		arrayToBeOrdered=sorting(arrayToBeOrdered,left_index+1,lastElement);	
		}
		return arrayToBeOrdered;
	}
	

	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered, Integer[] OrderedArray, Integer maxValue) {
		// TODO Auto-generated method stub
		return null;
	}


}
