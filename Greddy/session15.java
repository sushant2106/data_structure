//no of state is chnaging is we have to find out dry run 
//session 15

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		String s="01011";
		int n=s.length();
		int count=0;
		for(int i=0;i<n-1;i++){
		    if(s.charAt(i)!=s.charAt(i+1)){
		        count++;
		    }
		}
		if(s.charAt(0)==1){
		    count++;
		}
		System.out.println(count);
	}
}
