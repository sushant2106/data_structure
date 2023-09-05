import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    HashMap<String,String>map=new HashMap<>();
	     map.put( "Jan","1");
        map.put("Feb","2");
        map.put("Mar","3");
        map.put("Apr","4");
        map.put("May","5");
        map.put( "Jun","6");
        map.put( "Jul","7");
        map.put( "Aug","8");
        map.put("Sep","9");
        map.put( "Oct","10");
        map.put( "Nov","11");
        map.put( "Dec","12");
	  
	  String s="2th Nov 2052";
	  String str[]=s.split(" ");
	  
	  int i=0,n=str[0].length();
	  StringBuilder sb=new StringBuilder();
	  while(i<n){
	      if(s.charAt(i)-'0'>=0 && s.charAt(i)-'0'<=9){
	          sb.append(s.charAt(i));
	      }
	     else{
	         break;
	     }
	     i++;
	  }
	  
	  String date=sb.toString();
	  String month=map.get(str[1]);
	  StringBuilder ans=new StringBuilder(" ");
	  ans.append(str[2]);
	  ans.append("-");
	  ans.append(month);
	  ans.append("-");
	  ans.append(date);
	  String fin=ans.toString();
	  System.out.println(fin);
	  
	  
	  
	  
	  
	}
}
