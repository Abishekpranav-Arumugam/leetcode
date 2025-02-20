class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        List<Integer> l1=new ArrayList<>();
        for(int i:nums)
        l1.add(i);
        return l1.get(l1.size()-k);
    }
}