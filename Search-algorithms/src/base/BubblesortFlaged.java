package base;

public class BubblesortFlaged {	
	/**
	 * it will order the array v not view
	 * @param v messy array
	 * 
	 * */	
	public static void sorting(int v[]) {
		int i,j,tmp;
		i=v.length;	
		boolean sorted=false;
		
		while((i>=1)&&(!sorted)){
			sorted=true;
			for(j=1;j<i;j++){
				if(v[j-1]>v[j]){
				   tmp=v[j-1];
				   v[j-1]=v[j];
				   v[j]=tmp;
				   sorted=false;
				}
			}
		 i=i-1;	
		}		
	}
}
