package base;

public class SelectionSort {
	
	static int i,j,min,tmp;
	
	static void  sortvector(int []v) {
	
	for(i=0;i<=v.length-2;i++) {
		min=i;
		for(j=i+1;i<v.length-1;j++) {
			if(v[j]<v[min])
				min=j;
		}
	tmp=v[min];
	v[min]=v[j];
	v[i]=tmp;
		
	}
  }
}
