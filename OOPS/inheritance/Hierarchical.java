import java.util.*;
class Animal{
    void eat(){
        System.out.println("Animal can eat...");
    }
    void breath(){
        System.out.println("Animal can breath...");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Fish can swim...");
    }
}
class Shark extends Fish{
    void big(){
        System.out.println("I am big shark...");
    }
}
public class Main{
    public static void main(String args[]){
        Shark obj=new Shark();
        obj.swim();
    }
}
