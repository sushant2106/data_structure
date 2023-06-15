import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String str="WNEENESENNN";
		int x=0;
		int y=0;
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)=='N'){
		        y+=1;
		    }
		    else if(str.charAt(i)=='E'){
		        x+=1;
		    }
		    else if(str.charAt(i)=='W'){
		        x-=1;
		    }
		    else{
		        y-=1;
		    }
		}
		x=x*x;
		y=y*y;
		System.out.println(Math.sqrt(x+y));
	}
}
