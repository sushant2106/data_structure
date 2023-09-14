import java.util.*;
public class Main
{
	public static void main(String[] args) {
		 int val[]={60,100,120};
		 int weight[]={10,20,30};
		 int w=50;
		 
		 double ratio[][]=new double[val.length][2];
		 
		 for(int i=0;i<val.length;i++){
		     ratio[i][0]=i;
		     ratio[i][1]=val[i]/(double)weight[i] ;
		 }
		int cap=w;
		double finalval=0;
		Arrays.sort(ratio,Comparator.comparingDouble(a->a[1]));//based on second column it will sort 
	//ascendin order mai sort hoga ye 
		for(int i=val.length-1;i>=0;i--){
		    int idx=(int)ratio[i][0];
		    if(cap>=weight[idx]){
		        finalval+=val[idx];
		        cap-=weight[idx];
		    }
		    else{
		        finalval+=ratio[i][1]*cap;
		        break;
		    }
	
		}
		System.out.println(finalval);
		
		 
		 
	    
	}
}
