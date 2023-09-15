import java.util.*;

public class Main
{   
    static int solve(int tot,int money,int sell,int upgrade){
        int tryi=0;
        int earning=0;
        int cost=0;
        int left=0;
        int answer=tot;
        while(tryi<=tot-1){
            earning=tryi*sell+money;
            left=tot-tryi;
            cost=(left*upgrade);
            if(earning>=cost){
                answer=tryi;
                break;
            }
            tryi++;
        }
        return answer;
    }
	public static void main(String[] args) {
		int house[]={4,3};
		int money[]={8,9};
		int sell[]={4,2};
		int upgrade[]={4,5};
		for(int i=0;i<house.length;i++){
		    int upg=solve(house[i],money[i],sell[i],upgrade[i]);
		    System.out.println(house[i]-upg);
		}
	}
}
