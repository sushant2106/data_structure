import java.util.*;
class A{
    void show(){
        System.out.println("I am in A..");
    }
}
public class Main{
    public static void main(String args[]){
        A obj=new A(){
            public void show(){
               System.out.println("New Show...");
            }
        };
        obj.show();
    }
}
