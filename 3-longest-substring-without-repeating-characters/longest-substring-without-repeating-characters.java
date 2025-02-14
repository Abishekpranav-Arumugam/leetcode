class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int n=s.length();
        int start=0,end=0,maxlen=0;
        while(end<n)
        {
            if(!set.contains(s.charAt(end)))
            {
                set.add(s.charAt(end));
                maxlen=Math.max(maxlen,end-start+1);
                end++;
            }
            else
            {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return maxlen;
    }
}