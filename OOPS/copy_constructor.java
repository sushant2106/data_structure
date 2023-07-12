import java.util.*;
class Student{
    String name;
    int roll;
    String password;
    int marks[];
    
    Student(){
        marks=new int[3];
        System.out.println("Hii..");
    }
    Student(Student s1){// it is known as Copy constructor
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }
}

public class Main
{
	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="ram";
		s1.roll=123;
		s1.password="sam285";
		s1.marks[0]=10;
		s1.marks[1]=11;
		s1.marks[2]=12;
		
		Student s2=new Student(s1);//passing the object 
		s2.password="xyz";
		s1.marks[0]=122;//yaha s1 change krne par s2 ka bhi value badal gya hai 
		ye shallow copy hai deep copy mai naya array bnke copy hota yaha usi ko point kr rha hai
		for(int i=0;i<3;i++){
		    System.out.println(s2.marks[i]);
		}
		
		System.out.println(s2.name);
	
	}
}
