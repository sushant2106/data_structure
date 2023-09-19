import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        int arr[][]={{0,3},{2,5},{0,9},{1,15}};
        Arrays.sort(arr,(a,b)->a[1]-b[1]);
        int prev_end=arr[0][1];
        int duration=arr[0][1];
        int id=arr[0][0];
        for(int i=1;i<arr.length;i++){
             int curr_end=arr[i][1];
             int diff=curr_end-prev_end;
             if(diff>duration){
                 duration=diff;
                 id=arr[i][0];
                 
             }
             prev_end=curr_end;
        }
        System.out.println(duration);
     }
}
