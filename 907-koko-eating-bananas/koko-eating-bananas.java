class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1, r=piles[0];
        for(int pile:piles)
        {
            r=Math.max(r,pile);
        }
        while(l<r)
        {
            int mid=l+(r-l)/2;
            int sum=0;
            for(int pile:piles)
            {
                sum+=(long) Math.ceil((double)pile/mid);
            }
            if(sum<=h)
            {
                r=mid;
            }
            else
            {
                l=mid+1;
            }
        }
        return l;
    }
}