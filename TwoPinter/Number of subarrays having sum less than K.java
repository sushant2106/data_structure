import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int arr[] = {1, 11, 2, 3, 15};
        int k=10;
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum<k){
                    count++;
                }
                else{
                    break;
                }
               
            }
        }
        System.out.println(count);
	}
}
