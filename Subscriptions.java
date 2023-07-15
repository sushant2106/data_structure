import java.util.*;

class Newspaper {
    String name;
    double[] prices;
    //constructor for assigning the value
    public Newspaper(String name, double[] prices) {
        this.name = name;
        this.prices = prices;
    }
}
public class Main
{     
    static void calculate(List<Newspaper> newspapers,double budget){
        double total_price[]=new double[newspapers.size()];
        int k=0;
        for(Newspaper x:newspapers){
            double sum=0;
          for(int i=0;i<7;i++){
            sum+=x.prices[i];
          }
          total_price[k++]=sum;
        }
        k=0;
        HashMap<Double,String>map=new HashMap<>();
        for(Newspaper x:newspapers){
             map.put(total_price[k++],x.name);
         }
        
        Set<Set<String>>ans=new HashSet<>();
        for(int i=0;i<k;i++){
          double pri=budget-total_price[i];
          Set<String>li=new HashSet<>();
          for(int j=i+1;j<k;j++){
              if(pri>=total_price[j] ){
                 if(li.size()==2){
                 Set<String>m=new HashSet<>();
                m.add(map.get(total_price[i]));
                  m.add(map.get(total_price[j]));
                  ans.add(m);
                 }
                 else{
                      li.add(map.get(total_price[i]));
                  li.add(map.get(total_price[j]));
                  ans.add(li);
                
                 }
                 
              }
               
          }
        }
        System.out.println(ans);
    
        
    }
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
		List<Newspaper> newspapers = new ArrayList<>();
        newspapers.add(new Newspaper("TOI", new double[]{3.0, 3.0, 3.0, 3.0,3.0, 5.0, 6}));
        newspapers.add(new Newspaper("Hindu", new double[]{2.5, 2.5, 2.5, 2.5, 2.5, 4, 4}));
        newspapers.add(new Newspaper("ET", new double[]{4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 10}));
        newspapers.add(new Newspaper("BM", new double[]{1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5}));
        newspapers.add(new Newspaper("HT", new double[]{2.0, 2.0, 2.0, 2.0, 2.0, 4.0, 4.0}));
        
        double budget=35;
        calculate(newspapers,budget);

        
	}
}
