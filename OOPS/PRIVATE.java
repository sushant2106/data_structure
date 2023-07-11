import java.util.*;
class BankAcount{
    public String user_name;
    private String password;
    
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
}
public class OOps
{
	public static void main(String[] args) {
	 BankAcount obj=new BankAcount();
	 obj.user_name="Ram kumar";
	 obj.setPassword("123@");
	 System.out.println(obj.getPassword());
}
}
