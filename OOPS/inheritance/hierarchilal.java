import java.util.*;
class Animal{
    String color;
    void eat(){
        System.out.println("eats...");
    }
    void breath(){
        System.out.println("I can breath...");
    }
}
class Mammal extends Animal{
   void walk(){
       System.out.println("Mammal can walk...");
   }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog can bark");
    }
}
public class Main
{
	public static void main(String[] args) {
	   Dog obj=new Dog();
	   obj.breath();
	}
}
