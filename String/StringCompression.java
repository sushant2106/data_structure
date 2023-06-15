import java.util.*;
public class Main
{
	public static void main(String[] args) {
	     String str="aaabbcccdd";
	     StringBuilder ans=new StringBuilder("");
	     int n=str.length();
	     int count=0;
	     for(int i=0;i<n-1;i++){
	         char a=str.charAt(i);
	         char b=str.charAt(i+1);
	         if(a==b){
	             count++;
	         }
	         else{
	             ans.append(a);
	             ans.append(Integer.toString(count+1));
	             count=0;
	         }
	     }
	   ans.append(str.charAt(n-1));
	   ans.append(Integer.toString(count+1));
	     System.out.println(ans);
	}
}
