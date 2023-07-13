import java.util.*;
class Animal{
    String color;
    void eat(){
        System.out.println("eats...");
    }
}
class Fish extends Animal{
    
    void swing(){
        System.out.println("Swing...");
    }
}
public class Main
{
	public static void main(String[] args) {
	    Fish obj=new Fish();
	    obj.eat();
	}
}
