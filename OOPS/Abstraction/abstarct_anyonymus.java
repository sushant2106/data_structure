import java.util.*;
abstract class A{
    abstract void show();
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
