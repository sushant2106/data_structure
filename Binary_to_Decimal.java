package org.example;
import java.util.*;
public class Main{
     static void decimal_BInary(){
        int n=5;
        int pow=0;
        int deci=0;

        while(n>0){
            int rem=n%2;
            deci+=(rem*(int)Math.pow(10,pow++));
            n=n/2;

        }
        System.out.println(deci);

    }
   static void binary_decimal(){
           int n=101;
        int deci=0;
        int i=0;
        while(n>0){
            int rem=n%10;
            deci+=rem*Math.pow(2,i++);
            n=n/10;
        }
        System.out.println(deci);
   }
    public static void main(String args[]){
    
        binary_decimal();
        decimal_Binary();

    }
}
