class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> map=new HashSet<>();
        for(char jewel:jewels.toCharArray())
        {
            map.add(jewel);
        }
        int count=0;
        for(char stone:stones.toCharArray())
        {
            if(map.contains(stone))
            {
              count++;
            }
        }
    return count;
    }
}