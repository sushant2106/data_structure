import java.util.*;
interface A{
    int age=44;//by default its final and static
    void show();//by default its public in nature
    void config();
}
class B implements A{
    public void show(){
        System.out.println("I am B..show");
    }
    public void config(){
        System.out.println("config...");
    }
}

public class Main
{
	public static void main(String[] args) {
	     //  A obj=new B();//we can only able to create refrence
	       B obj2=new B();//both way we can access...
	     //  obj.show();
	       obj2.show();
	       
	}
}
