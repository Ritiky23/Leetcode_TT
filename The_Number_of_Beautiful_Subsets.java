class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        int [] count = new int[1001];
        return solve(0,nums, k, count)-1;
    }
    private int solve(int i, int [] nums, int k , int [] count){
        if(i>=nums.length)
            return 1;
        
        int ans=0; 
        if(nums[i]-k < 0 || count[nums[i]-k]==0){
            count[nums[i]]++;
            ans+=solve(i+1, nums, k, count);
            count[nums[i]]--;
        }

        ans+=solve(i+1, nums, k, count);
        return ans;
    }
}
