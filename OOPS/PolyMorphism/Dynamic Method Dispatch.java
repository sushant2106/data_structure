import java.util.*;
class A{
     void show(){
        System.out.println("I am in A....");
     }
}
class B extends A{
    void show(){
        System.out.println("I am in B....");
     }
}
class C extends A{
    void show(){
        System.out.println("I am in C....");
     }
}
public class Main{
    public static void main(String args[]){
        // A obj=new B();//object type b ka hai 
        // obj.show();
        A obj=new A();
        obj.show();
        
        obj=new B();
        obj.show();
        
        obj=new C();
        obj.show();
    }
}
