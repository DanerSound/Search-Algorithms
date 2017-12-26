import java.util.Random;
	
public class RandNum {

	static int num;	
	static int v[]= new int[10];	
	
public static void myrand(){
	
		Random rand =new Random();
		
		int maxSize=10;
		for(int i=0;i<maxSize;i++) {
			num=rand.nextInt(20);
			v[i]=num;
		}
	}

}
