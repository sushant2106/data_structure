//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static boolean possible(int stalls[],int distance,int k){
        int cordinate=stalls[0];
        int cow=1;
        for(int i=1;i<stalls.length;i++){
            if(Math.abs(stalls[i]-cordinate)>=distance){
                cordinate=stalls[i];
                cow++;
            }
        }
        return cow>=k;
    }
    public static int solve(int n, int k, int[] stalls) {
        int l=1;
        Arrays.sort(stalls);
        int h=stalls[n-1]-stalls[0];
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(possible(stalls,mid,k)){
                l=mid+1;
                ans=mid;
            }
            else{
                h=mid-1;
            }
            
        }
        return ans;
    }
}
