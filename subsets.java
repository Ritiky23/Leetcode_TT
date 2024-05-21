class Solution {
    List<List<Integer>> fres= new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> res=new ArrayList<>();
        solve(nums,0,res);
        return fres;
    }
    public void solve(int[] nums,int i,List<Integer> res){
        if(i==nums.length){
            fres.add(new ArrayList(res));
            return;
        }
        res.add(nums[i]);
        solve(nums,i+1,res);
        res.remove(res.size()-1);
        solve(nums,i+1,res);

    }
}
