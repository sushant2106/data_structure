import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int ar1[] ={1, 4, 5, 7};
        int ar2[] ={10, 20, 30, 40};
        int x=50;
        int ans[]=new int[2];
        int n=ar1.length;
        int m=ar2.length;
        int min=Integer.MAX_VALUE;
        // for(int i=0;i<n;i++){
        //    int l=0;
        //    int h=m-1;
        //    while(l<h){
        //        int sum=ar1[i]+ar2[h];
        //        int curr=Math.abs(sum-x);
        //        if(min>curr){
        //            ans[0]=ar1[i];
        //            ans[1]=ar2[h];
        //            l++;
        //            h--;
        //            min=curr;
        //        }
        //        else{
        //            l++;
        //        }
        //    }
        // }
     int l=0;
         int h=m-1;
         while(l<n && h>=0){
             int dif=Math.abs(ar1[l]+ar2[h]-x);
             if(min>dif){
                 ans[0]=ar1[l];
                 ans[1]=ar2[h];
                 min=dif;
             }
             if(ar1[l]+ar2[h]>x){
                 h--;
             }
             else{
                 l++;
             }
         }
        System.out.println(Arrays.toString(ans));
	}
}
