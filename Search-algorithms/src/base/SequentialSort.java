package base;

public class SequentialSort {

	  static int i,j,min,tmp; 
	   
	  static void  sequentialSort(int []v) { 
	   
	  for(i=0;i<=v.length-2;i++) { 
	    min=i; 
	    for(j=i+1;j<v.length-1;j++) { 
	      if(v[j]<v[min]) 
	        min=j; 
	    } 
	  tmp=v[min]; 
	  v[min]=v[i]; 
	  v[i]=tmp; 
	     
	  } 
	}
	  
}
