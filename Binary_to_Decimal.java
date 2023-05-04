package org.example;
import java.util.*;
public class Binary_to_Decimal{
    public static void main(String args[]){
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
}
