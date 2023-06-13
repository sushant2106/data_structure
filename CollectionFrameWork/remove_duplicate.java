import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  HashSet<Character>set=new HashSet<>();
	  String str="appnacollege";
	  String ans="";
	  for(int i=0;i<str.length();i++){
	      char a=str.charAt(i);
	      if(set.contains(a)){
	          continue;
	      }
	      else{
	          set.add(a);
	          ans+=a;
	      }
	  }
	  System.out.println(ans);
	}
}
