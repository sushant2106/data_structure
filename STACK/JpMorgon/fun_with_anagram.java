import java.util.*;

public class Main
{  
    static boolean check(String s,String t){
          if(s.length()!=t.length())return false;
       int alphabet[]=new int[26];
       for(int i=0;i<s.length();i++){
           alphabet[s.charAt(i)-'a']++;
           alphabet[t.charAt(i)-'a']--;
       }
    
       for(int i:alphabet){
           if(i!=0)return false;
       }
      return true;
    }
	public static void main(String[] args) {
	  String str[]={"code","doce","ecod","framer","frame"};
	   Stack<String>st=new Stack<>();
	   st.push(str[0]);
	   for(int i=1;i<str.length;i++){
	       if(check(st.peek(),str[i])){
	             continue;
	       }
	       else{
	           st.push(str[i]);
	       }
	   }
	   String ans[]=new String[st.size()];
	   int i=0;
	   
	   while(!st.isEmpty()){
	      ans[i++]=st.pop();
	   }
	   Arrays.sort(ans);
	   System.out.println(Arrays.toString(ans));
	 
	}
}
