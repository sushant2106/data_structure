import java.util.*;

public class Main
{     
    static String ans="";
    static void rev_string(String str,int h){
        if(h==0){
            ans+=str.charAt(h);
            return;
        }
         ans+=str.charAt(h);
         rev_string(str,h-1);
    }
	public static void main(String[] args) {
	    String str="abcde";
	    rev_string(str,str.length()-1);
		System.out.println(ans);
	}
}
