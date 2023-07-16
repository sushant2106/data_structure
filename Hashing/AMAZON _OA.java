import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s="mononom";
		String t="mon";
		HashMap<Character,Integer>map=new HashMap<>();
		for(int i=0;i<s.length();i++){
		    map.put(s.charAt(i),1+map.getOrDefault(s.charAt(i),0));
		}
		
		int min=Integer.MAX_VALUE;
		for(int i=0;i<t.length();i++){
		    char c=t.charAt(i);
		    if(!map.containsKey(c)){
		        System.out.println("0");
		        break;
		    }
		    min=Math.min(min,map.get(c));
		}
		if(min!=Integer.MAX_VALUE){
		    System.out.println(min);
		}
	}
}
