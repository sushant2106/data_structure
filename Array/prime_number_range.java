import java.util.*;
public class Main
{ 
    static boolean check(int n){
       if(n!=2 || n!=3){
            for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
       }
        return true;
    }
	public static void main(String[] args) {
		int n=15;
		for(int i=2;i<=n;i++){
		    if(check(i)){
		        System.out.print(i+" ");
		    }
		}
	}
}
