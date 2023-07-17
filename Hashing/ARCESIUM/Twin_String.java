import java.util.*;

public class Main
{
	public static void main(String[] args) {
	   String a= "dcba";
	   String b="abcd";
	   int count_even[]=new int[26];
	   int count_odd[]=new int[26];
	   
	   for(int i=0;i<a.length();i++){
	       if(i%2==0){
	           char c=a.charAt(i);
	           char d=b.charAt(i);
	           count_even[c-'a']++;
	           count_odd[d-'a']--;
	       }
	       else{
	           char d=a.charAt(i);
	           char e=b.charAt(i);
	           count_even[d-'a']++;
	           count_odd[e-'a']--;
	       }
	   }
	   boolean flag=true;
	   boolean flag2=false;
	   for(int x:count_even){
	       if(x!=0){
	           flag=true;
	           break;
	       }
	   }
	    for(int x:count_odd){
	       if(x!=0){
	           flag=true;
	           break;
	       }
	   }
	   if(flag || flag){
	      System.out.println("NO");
	   }
	   else{
	        System.out.println("Yes");
	   }
	   
	   
	}
}
