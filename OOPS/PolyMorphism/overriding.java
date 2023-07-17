import java.util.*;
class Animal{
    void eat(){
     System.out.println("eat anything..");
    }
}
class Deer extends Animal{
    void eat(){
     System.out.println("eat grass...");
    }
}
public class Main
{
	public static void main(String[] args) {
		Deer obj=new Animal();
		obj.eat();
	}
}
