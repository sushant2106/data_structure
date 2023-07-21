import java.util.*;
class Mobile{
    String name;
    String price;
    static String model;
    
    static{
        model="A20";
        System.out.println("In static block....");
    }//here static block call only once irresepective of number of object
    
    
    public Mobile(){
        this.name="samsung";
        this.price="20k";
        System.out.println("In Constructor...");
        
    }
    
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
	  
	  obj1.show();
	  
	  Mobile obj2=new Mobile();
	  obj2.show();
	  
	  
	}
}
