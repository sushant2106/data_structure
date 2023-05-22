import java.util.*;
public class Main
{
	public static void main(String[] args) {
		TreeMap<Character,Integer>arr=new TreeMap<>();
		arr.put('a',1);
		arr.put('b',2);
		for(Map.Entry<Character,Integer>x:arr.entrySet()){
		   System.out.println(x.getKey()+" "+x.getValue());
		}
	}
}
