import java.util.*;

abstract class Car{
   abstract void drive();
   abstract void hum();
    void play(){
      System.out.println("Play Music");
    }
}
abstract class bolero extends Car{
    void drive(){
        System.out.println("I am driving...");
    }
}
class tum extends bolero{
    void hum(){
        System.out.println("hum...");
    }
}
public class Main
{
	public static void main(String[] args) {
		tum obj=new tum();
		obj.hum();
	}
}
