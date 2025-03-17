class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> map=new HashMap<>();
        for(char jewel:jewels.toCharArray())
        {
            map.put(jewel,1);
        }
        int count=0;
        for(char stone:stones.toCharArray())
        {
            if(map.containsKey(stone))
            {
              count++;
            }
        }
    return count;
    }
}