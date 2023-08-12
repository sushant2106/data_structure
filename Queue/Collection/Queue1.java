import java.util.*;

public class Main
{
	public static void main(String[] args) {
	 Queue<Integer>qu=new LinkedList<>();
	 qu.offer(1);//use offer only bz add can give throw exception
	 qu.offer(2);
	 qu.offer(3);
	 System.out.println(qu.poll());
	 System.out.println(qu.peek());
	}
}
