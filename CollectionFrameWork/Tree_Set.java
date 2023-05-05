import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Set<Integer>set1=new TreeSet<Integer>();
		set1.add(2);
		set1.add(3);
		set1.add(1);
		set1.add(2);
		System.out.println(set1);
		
// 		Set<Integer>set2=new TreeSet<Integer>();
   var set2=new TreeSet<Integer>();
		set2.add(1);
		set2.add(3);
		System.out.println(set1.containsAll(set2));
	}
}
