import java.util.*;

public class Main
{
	public static void main(String[] args) {
		ArrayList<Integer>list2=new ArrayList<>();
		list2.add(2);
		System.out.println(list2);
		HashMap<Integer,Integer>map=new HashMap<>();
		map.put(1,2);
		for(Map.Entry<Integer,Integer>x:map.entrySet()){
		    System.out.println(x.getKey()+" "+x.getValue());
		}
		ArrayList<ArrayList<Integer>>li=new ArrayList<>();
		for(int i=1;i<=5;i++){
		    ArrayList<Integer>list=new ArrayList<>();
		    for(int j=1;j<=5;j++){
		        list.add(i*j);
		    }
		    li.add(list);
		}
		System.out.println(li);
		for(List<Integer>x:li){
		    for(Integer k:x){
		        System.out.print(k+" ");
		    }
		    System.out.println();
		}
	}
}
