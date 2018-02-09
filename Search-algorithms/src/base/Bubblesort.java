package base;

public class Bubblesort {
		
public static void sorting(int[]v){
	   int i,j,tmp;
		
	   for(i=v.length-1;i>=1;i--){
		   for(j=1;j<=i;j++){
			   if(v[j-1]>v[j]) {
				  tmp=v[j-1];
				  v[j-1]=v[j];
				  v[j]=tmp;
				}
			}   
		}
	}
  }
