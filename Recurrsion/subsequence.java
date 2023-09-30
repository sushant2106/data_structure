import java.util.*;

public class Main
{   
    static void subsequ(int index,int arr[],ArrayList<Integer>li){
        if(index==arr.length){
          System.out.println(li);
          return;
        }
        li.add(arr[index]);//take that Number
        subsequ(index+1,arr,li);
        li.remove(Integer.valueOf(arr[index]));//Not take that Number
        subsequ(index+1,arr,li);
    }
	public static void main(String[] args) {
	  int arr[]={3,1,2};
	  ArrayList<Integer>li=new ArrayList<>();
	  subsequ(0,arr,li);
	}
}
