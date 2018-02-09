package base;

public class Counting_sort {
	
	public static void sorting(int v[],int def[],int maxValue){
		int[] supp = new int[maxValue+1];
	
		for(int  i=0;i<maxValue;i++){
			supp[i]=0;
		}
		for(int j=0;j<v.length;j++){
			supp[v[j]]=supp[v[j]]+1;
		}
		for(int i=1;i< supp.length;i++){
			supp[i]=supp[i]+supp[i-1];
		}
		for(int j=v.length-1;j>=0;j--){
			def[supp[v[j]]-1]=v[j];
			supp[v[j]]=supp[v[j]]-1;			
		}	
	}
}
