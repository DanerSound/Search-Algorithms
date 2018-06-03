package base;

public class MergeSort extends SorterAlgorithm{
	
	/**
	 * This method orders the input array given, using the Merge sort algorithm.
	 * 
	 * @author Andre Cristhian (DanerSound)
	 * @author Gabriele Puliti (Wabri)
	 * @param arrayToBeOrdered
	 *            messy array
	 * @return array ordered
	 */
	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered) {
		return null;
	}
	/**
	 * This method orders a sub-portion of the input array given the indexes of the
	 * range, using the Merge sort algorithm.
	 * 
	 * @author Andre Cristhian (DanerSound)
	 * @author Gabriele Puliti (Wabri)
	 * @param arrayToBeOrdered
	 *            messy array
	 * @param firstElement
	 *            left extreme of the array
	 * @param lastElement
	 *            right extreme of the array
	 * @return array ordered
	 */
	
	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered, Integer firstElement, Integer lastElement) {
		if(lastElement-firstElement>0){
		Integer []backup= {firstElement,lastElement};
		int mid=(lastElement+firstElement)/2;	
		arrayToBeOrdered=sorting(arrayToBeOrdered,firstElement,mid);
		arrayToBeOrdered=sorting(arrayToBeOrdered,mid+1,lastElement);
		
		Integer[] support = new Integer[lastElement]; 
		//for(Integer i=mid; i>=1; i--){
		for(Integer i=0; i<=mid; i++){
		support[i]=arrayToBeOrdered[i];
			}
		for(Integer j=mid+1;j<lastElement;j++){
			support[lastElement+mid+1-j]=arrayToBeOrdered[j];
			}
		
		firstElement =backup[0];
		lastElement=backup[1];
		for(Integer index=0;index<lastElement;index++){
			if(support[firstElement]<support[lastElement]){
				arrayToBeOrdered[index]=support[firstElement];
				firstElement++;
			}else{
				arrayToBeOrdered[index]=support[lastElement];
				lastElement--;
			}	
		}
	}
		return arrayToBeOrdered;
}
	

}
