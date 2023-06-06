import java.util.*;

public class Main
{
    static void function(int count){
        if(count==5){
            return ;
        }
        System.out.println(count);
        function(count+1);
        System.out.println("back track...");
        System.out.println(count);
    }
	public static void main(String[] args) {
	    function(0);
		System.out.println("Hello World");
	}
}
