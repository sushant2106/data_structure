import java.util.*;

public class Main
{
	public static void main(String[] args) {
	 int arr[]={3,6,7,11};
        int h=8;
        int max=arr[0];
     //   int sum=0;
        for(int i=1;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            //sum+=arr[i];
        }
        int k=1;
        while(k<=max){
            int count=0;
            for(int i=0;i<arr.length;i++){
             
              count+=Math.ceil((double)arr[i]/k);
                if(count>h){
                    break;
                }
            }
            if(count<=h){
                break;
            }
            k++;
        }
        System.out.println(k);
	}
}
