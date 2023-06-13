import java.util.*;

public class Main
{
    static int friend_pair(int n){
        if(n<=2){
            return n;
        }
        return friend_pair(n-1)+(n-1)*friend_pair(n-2);
    }
	public static void main(String[] args) {
	    System.out.println(friend_pair(4));
	}
}
