class Solution {
    public int maxSubArray(int[] nums) {
        int tot=0,res=nums[0];
        for(int n:nums)
        {
            if(tot<0)
            tot=0;
            tot+=n;
            res=Math.max(tot,res);
        }
        return res;
    }
}