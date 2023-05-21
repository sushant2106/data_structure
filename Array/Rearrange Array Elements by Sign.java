import java.util.*;

public class Main
{
   
	public static void main(String[] args) {
	int arr[]={1,2,-4,-5,3,6};
	List<Integer>pos=new ArrayList<>();
	List<Integer>neg=new ArrayList<>();
	int arr2[]=new int[arr.length];
	
	for(int x:arr){
	    if(x>=0){
	        pos.add(x);
	    }
	    else{
	        neg.add(x);
	    }
	}
	int i=0,j=0;
	int k=0;
    while(i<pos.size() && j<neg.size()){
        arr2[k]=pos.get(i);
        arr2[k+1]=neg.get(j);
        k+=2;
        i++;
        j++;
       
    }
    while(i<pos.size()){
        arr2[k]=pos.get(i);
        k++;
        i++;
    }
    while(j<neg.size()){
        arr2[k]=neg.get(j);
        k++;
        j++;
    }
	
	
	
	
	
    	System.out.println(Arrays.toString(arr2));
	
	}
}
