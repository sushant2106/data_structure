import java.util.*;

public class Main
{
	public static void main(String[] args) {
	  int n=4,m=6;
	  Integer costVer[]={2,1,3,1,4};//m-1 cut
	  Integer costHor[]={4,1,2};//n-1 cut
	  Arrays.sort(costVer,Collections.reverseOrder());
	  Arrays.sort(costHor,Collections.reverseOrder());
	   int h=0,v=0;
	   int hp=1,vp=1;
	   int cost=0;
	   while(v<costVer.length && h<costHor.length){
	       
	       if(costHor[h]>=costVer[v]){
	           cost+=(costHor[h]*vp);
	           hp++;
	           h++;
	       }
	       else{
	           cost+=(costVer[v]*hp);
	           vp++;
	           v++;
	       }
	   }
	   while(v<costVer.length){
	         cost+=(costVer[v]*hp);
	           vp++;
	           v++;
	   }
	   while(h<costHor.length){
	        cost+=(costHor[h]*vp);
	           hp++;
	           h++;
	   }
	   System.out.println("final cost="+cost);
	
	}
}
