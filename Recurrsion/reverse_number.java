import java.util.*;

public class Main
{ 
    static int sum=0;
   static void rev(int num){
       if(num<=0){
           return ;
       }
       sum=sum*10+num%10;
       num=num/10;
       rev(num);
   }
	public static void main(String[] args) {
    
     int num=42;
    //   int sum=0;
    //   while(num>0){
    //       sum=sum*10+num%10;
    //       num=num/10;
    //   }
    rev(num);
      System.out.println(sum);
	}
}
