import java.util.*;

public class Main
{
	public static void main(String[] args) {
	String nam="A1b2%&c";
	String na="";
	for(int i=0;i<nam.length();i++){
	    char ch=nam.charAt(i);
	    boolean flag=(ch-'0'>=0 && ch-'0'<=9);
	    if(Character.isUpperCase(ch) || flag ){
	        na+=ch;
	    }
	}
	System.out.println(na);
	
	}
}
