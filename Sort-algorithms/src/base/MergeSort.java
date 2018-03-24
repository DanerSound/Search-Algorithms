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
		Integer mid=(lastElement+firstElement)/2;
		
		arrayToBeOrdered=sorting(arrayToBeOrdered,firstElement,mid);
		arrayToBeOrdered=sorting(arrayToBeOrdered,mid+1,lastElement);
		
			
		}
		
		return arrayToBeOrdered;
	}
	

}
