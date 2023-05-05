package org.example;
import java.util.*;
public class Main {
    static void pair_in_array(int num[]){

   for(int i=0;i<num.length;i++){

         for (int j=i+1;j<num.length;j++){
             System.out.print("("+num[i]+","+num[j]+")");

     }
       System.out.println();
   }
    }
    static void subArray(int num[]){
        System.out.println("----------------------------------------------------------");

        int n=num.length;
      for(int i=0;i<num.length;i++){
        for(int j=i;j<n;j++){
            for(int k=i;k<=j;k++){
                System.out.print("("+num[k]+","+")");

            }
            System.out.println();
        }
      }
    }
    static void max_sum(int arr[]){
        int n=arr.length;
        int pre[]=new int[n];
        int maxi=Integer.MIN_VALUE;
        pre[0]=arr[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+arr[i];
        }
        int sum=0;
        for(int i=0;i<n;i++){
            int start=i;
            for(int j=i;j<n;j++){
                int end=j;
                 sum=start==0?pre[end]:pre[end]-pre[start-1];
                maxi=Math.max(maxi,sum);
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
  int arr[]={1,2,3,4,5};
     pair_in_array(arr);
     subArray(arr);
     max_sum(arr);
    }
}