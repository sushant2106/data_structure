import java.util.*;

abstract class Car{
   abstract void drive();
    void play(){
      System.out.println("Play Music");
    }
}
class bolero extends Car{
    void drive(){
        System.out.println("I am driving...");
    }
}
public class Main
{
	public static void main(String[] args) {
		Car obj=new bolero();//Car ka refrence hai
		obj.drive();//Magar bolero ka object hai
	}
}
