import java.util.*;
class Mobile{
    String name;
    String price;
    static String model;
    
    
    // public void show(){
    //     System.out.println("name:"+name);
    //     System.out.println("price:"+price);
    //     System.out.println("model:"+model);
    // }
    public static void show1(Mobile obj1){
        System.out.println("name:"+obj1.name);
        System.out.println("price:"+obj1.price);
        System.out.println("model:"+model);
    }
    
}
public class Main
{
	public static void main(String[] args) {
	  Mobile obj1=new Mobile();
	  obj1.name="samsung";
	  obj1.price="20k";
	  obj1.model="A50";
	 // Mobile.show1();
	  //obj1.show1();like this it will give error 
	  // we can't call instance variable in static 
	  //bz it get confused
	  Mobile.show1(obj1);
	  
	  
	}
}
