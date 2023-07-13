import java.util.*;
class Animal{
    String color;
    void eat(){
        System.out.println("eats...");
    }
}
class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal{
    String breed;
}
public class Main
{
	public static void main(String[] args) {
	   Dog obj=new Dog();
	   obj.color="black";
	   obj.legs=4;
	   obj.breed="Hybrid";
	   System.out.println(obj.legs);
	}
}
