import java.util.*;
class Mobile{
    String name;
    String price;
    static String model;
    public void show(){
        System.out.println("name:"+name);
        System.out.println("price:"+price);
        System.out.println("model:"+model);
    }
    
}
public class Main
{
	public static void main(String[] args) {
	  Mobile obj1=new Mobile();
	  obj1.name="Apple";
	  obj1.price="50k";
	 // obj1.model="13";
	 Mobile.model="13";
	  
	  Mobile obj2=new Mobile();
	  obj2.name="Samsung";
	  obj2.price="60k";
        // obj2.model="galaxy";
	  Mobile.model="galaxy";
	  
	  obj1.show();
	  obj2.show();
	  
	  
	}
}
