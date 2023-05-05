class Solution{
    static long maximumSumSubarray(int k, ArrayList<Integer> arr,int N){
        int i=0;
        int j=0;
        long s=0;
        long a=0;
        while(j<arr.size()){
            s+=arr.get(j);
            if(j-i+1==k){
                a=Math.max(s,a);
                s-=arr.get(i);
                i+=1;
            }
            
            j+=1;
        }
        return a;
    }
}