import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    HashMap<Character,Integer>map=new HashMap<>();
	    String s="aabacbebebe";
	    int n=s.length();
	    int k=3;
	    int i=0,j=0;
	    int count=0;
	    int length=-1;
	    while(j<n){
	        char c=s.charAt(j);
	        map.put(c,1+map.getOrDefault(c,0));
	        if(map.size()<k){
	            j++;
	        }
	        else if(map.size()==k){
	            length=Math.max(j-i+1,length);
	            j++;
	        }
	       
	        else if(map.size()>k){
	            while(map.size()>k){
	                 char m=s.charAt(i);
	                 map.put(m,map.get(m)-1);
	                 if(map.get(m)==0){
	                     map.remove(m);
	                 }
	                 i++;
	            }
	            j++;
	        }
	        
	    }
	System.out.println(length);
	}
}
