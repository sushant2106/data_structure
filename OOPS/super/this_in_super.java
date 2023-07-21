import java.util.*;
class A extends Object
{
    A(){
        super();
       System.out.println("A...");
    }
    A(int a){
        super();
        System.out.println("A..."+a);
    }
}
class B extends A{
    B(){
         super();
        System.out.println("B..");
    }
    B(int a){
        this();
        System.out.println("B.."+a);
    }
}
public class Main
{
	public static void main(String[] args) {
	    B obj=new B(5);
	}
}
