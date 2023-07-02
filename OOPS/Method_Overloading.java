import java.util.*;
class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,int b){
        return a+b;
    }
}

public class Main
{
	public static void main(String[] args) {
	   Calculator obj=new Calculator();
	   System.out.println(obj.add(2,3));
	   System.out.println(obj.add(2,3,5));
	   System.out.println(obj.add(4.67,3));
	}
}
//function name should be same 
//even their data type or return type also diff then also it can overload
//
