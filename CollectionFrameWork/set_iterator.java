import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Set<String> set = new HashSet<String>();
        set.add("Welcome");
        set.add("To");
        set.add("Geeks");
        set.add("4");
        set.add("Geeks");
        
        Iterator itr=set.iterator();
        while(itr.hasNext()){
        System.out.println(itr.next());
        }
	}
}
