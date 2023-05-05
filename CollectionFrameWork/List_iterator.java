import java.util.*;
public class Main
{
	public static void main(String[] args) {

        var list=new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(null);
        list.add(4);
        list.add(null);
        ListIterator itr= list.listIterator();
          //if you want your iteration from other Index
         // ListIterator itr=list.listIterator(1);
         
        //  System.out.println("If ypu want in reverse order tarversing");
        //  ListIterator itr=list.listIterator(list.size());
    
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }
        
        // while(itr.hasPrevious()){
        //     System.out.println(itr.previous());
        // }
        System.out.println("After removal of null...");
       
        while(itr.hasNext()){
            if(itr.next()==null)
            {
               // itr.remove();
               itr.set(0);
            }
        }
       
       System.out.println(list);
        
	}
}
