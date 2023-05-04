package org.example;
import java.util.*;

public class Pattern1 {
    static void zpattern(int n) {
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i = 1; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print("  ");
            }
            System.out.print("*" + " ");
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        System.out.println("--------------------------------------------------------");
    }
    static void num_pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------");
    }
    static void star(int n){
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------");
    }
    static  void inverted_star(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void half_pyramid(int n){
        System.out.println("--------------------------------------------------------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
  static void inert_half_pyramid(int n){
      System.out.println("--------------------------------------------------------");
      for(int i=n;i>=1;i--){
          for(int j=i;j>=1;j--){
              System.out.print(j+" ");
          }
          System.out.println();
      }
  }
static void character_print(int n){
    System.out.println("--------------------------------------------------------");

        for(int i=0;i<n;i++){
          for(int j=65;j<=65+i;j++){
                System.out.print((char)j +" ");
           }
            System.out.println();
        }

}
    static void another_character_print(int n){
        System.out.println("--------------------------------------------------------");
        int k=65;
       for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){

               System.out.print((char)k+" ");
         k++;
           }
           System.out.println();
//        char ch='A';
//        for(int line=1;line<=n;line++){
//            for(int chars=1;chars<=line;chars++){
//                System.out.print(ch+" ");
//                ch++;
//            }
//            System.out.println();
       }
    }
    static void hollow_rectangle(int n){
        System.out.println("--------------------------------------------------------");
//        for(int i=1;i<=n;i++){
//            if(i==1){
//                for (int j=1;j<=n;j++){
//                    System.out.print("*"+" ");
//                }
//                System.out.println();
//            }
//             else if(i==n){
//                for (int j=1;j<=n;j++){
//                    System.out.print("*"+" ");
//                }
//                System.out.println();
//            }else{
//                System.out.print("*"+" ");
//                for(int j=2;j<n;j++){
//                    System.out.print("  ");
//                }
//                System.out.print("*");
//                System.out.println();
//            }

   //     }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){

            if(i==1 || i==n || j==1 || j==n){
                System.out.print("*"+" ");
            }
            else {
                System.out.print("  ");
            }
            }
            System.out.println();
        }

    }
    static void inverted_rotated_half_pyramid(int n){
        System.out.println("--------------------------------------------------------");
        int j=0;
        for(int i=0;i<n;i++){
            for(j=0;j<n-1-i;j++){
                System.out.print(" ");
            }
            for(int k=j;k<n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void inverted_half_pyramid_withNumber(int n){
        System.out.println("--------------------------------------------------------");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void flyods_trinagle(int n){
        System.out.println("--------------------------------------------------------");
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }

    }
    static void zero_one_triangle(int n){
        System.out.println("--------------------------------------------------------");
        boolean flag=true;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(flag){
                    System.out.print("1"+" ");
                    flag=!flag;
                }
                else {
                    System.out.print("0"+" ");
                    flag=!flag;
                }
            }
            System.out.println();
        }

    }
    static void butterfly_pattern(int n){
        System.out.println("--------------------------------------------------------");
        //first Half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void solid_rhombus(int n){
        System.out.println("--------------------------------------------------------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.print("*****");
//            for(int k=1;k<=i;k++){
//                System.out.print(" ");
//            }
            System.out.println();
        }
    }
    static void number_pyramid(int n){
        System.out.println("--------------------------------------------------------");
        for(int i=1;i<=n;i++){
            //left space print
            for (int k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
//            for (int k=1;k<=n-i;k++)
//            {
//                System.out.print(" ");
//            }
            System.out.println();
        }
    }
static void palindromic_pattern(int n){
    System.out.println("--------------------------------------------------------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
            for(int m=2;m<=i;m++){
                System.out.print(m);
            }
            System.out.println();
        }
}



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        zpattern(n);
        num_pattern(n);
        star(n);
        inverted_star(n);
        half_pyramid(n);
        inert_half_pyramid(n);
        character_print(n);
        another_character_print(n);
        hollow_rectangle(n);
        inverted_rotated_half_pyramid(n);
        inverted_half_pyramid_withNumber(n);
        flyods_trinagle(n);
        zero_one_triangle(n);
        butterfly_pattern(n);
        solid_rhombus(n);
        number_pyramid(n);
        palindromic_pattern(n);

    }
}