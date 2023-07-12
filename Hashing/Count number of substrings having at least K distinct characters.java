import java.util.*;

public class Main
{  
    static int check(String s,int k){
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,1+map.getOrDefault(c,0));
        }
        if(map.size()<k){
            return 0;
        }
        return 1;
    }
	public static void main(String[] args) {
		
        String s="abcca";
        int k=3;
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String m=s.substring(i,j+1);
               if(m.length()<k){
                   continue;
               }
               else{
                   count+=check(m,k);
               }
            }
        }
        System.out.println(count);
	}
}
