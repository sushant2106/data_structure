import java.util.*;

public class Main
{   
    static boolean vaild_check(String s){
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==')'){
                int count=0;
                while(!st.isEmpty() && st.peek()!='('){
                    count++;
                    st.pop();
                }
                if(count<1)return true;
                st.pop();
            }
            else{
                st.push('(');
            }
        }
        return false;
    }
	public static void main(String[] args) {
	   String str="(a+b)";
	   String str2="((a+b))";
	   System.out.println(vaild_check(str2));
	}
}
