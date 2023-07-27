
class Compute {
    
    public long[] printFirstNegativeInteger(long arr[], int n, int k)
    {
        long ans[]=new long[n-k+1];
        int i=0,j=0;
        List<Long>li=new ArrayList<>();
        while(j<n){
            if(arr[j]<0){
                li.add(arr[j]);
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(li.size()==0){
                    ans[i]=0;
                }
                else{
                    ans[i]=li.get(0);
                    if(arr[i]==li.get(0)){
                        li.remove(0);
                    }
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
