import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    HashSet<Integer>set1=new HashSet<Integer>();
	    set1.add(10);
	    set1.add(20);
	    set1.add(30);
	    set1.add(50);
	    set1.add(10);
	    set1.add(40);
	    
	    set1.remove(40);
// // 	  List<Integer> list = new ArrayList<Integer>(set1);
// //         Collections.sort(list);
//         for(int i=0;i<set1.size();i++)
//         {
//              System.out.println(list.get(i));
//         }
//   var list=new ArrayList<Integer>();
//   list.addAll(set1);
     var set2=new HashSet<Integer>();
     set2.add(10);
     set2.add(3);
     System.out.println("After union of set1 and set2...");
     set1.addAll(set2);
     System.out.println(set1);
    System.out.println("After Intersection of set1 and set2...");
    set1.retainAll(set2);
    System.out.println(set1);
	    
	       
	   
	    
	}
}
