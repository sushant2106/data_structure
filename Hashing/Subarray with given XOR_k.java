import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    int a[]={4, 2, 2, 6, 4};
	    int k=6;
	 HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        map.put(0,1);
        int xor=0;
        for(int i=0;i<a.length;i++){
            xor^=a[i];
            if(map.containsKey(xor^k)){
                count+=map.get(xor^k);
            }
           map.put(xor,1+map.getOrDefault(xor,0));
        }
        System.out.println(count);
	}
}
