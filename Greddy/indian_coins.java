import java.util.*;

public class Main
{
	public static void main(String[] args) {
	int coins[]={1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
    int rup=43,count=0;
    int i=coins.length-1;
    while(rup>0){
        while(rup-coins[i]>=0){
            count++;
            rup-=coins[i];
        }
        i--;
    }
    System.out.println(count);
	
	
	
	
	
	
	
	}
}
