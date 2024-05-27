class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;

        int lo = 0, hi = 100;

        while (lo <= hi) {
            int mid = (lo + hi)/2;

            int valid = check(nums, mid);

            if (valid == mid) {
                return mid;
            }
            else if (valid > mid) {
                lo = mid+1;
            }
            else {
                hi = mid-1;
            }
        }

        return -1;
    }

    public int check(int[] nums, int x) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (x <= nums[i]) {
                count++;
            }
        }

        return count;
    }
}
