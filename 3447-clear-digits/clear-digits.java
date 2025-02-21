class Solution 
{
    public String clearDigits(String s) 
    {
        StringBuilder l1=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                l1.deleteCharAt(l1.length()-1);
            }
            else
            {
                l1.append(s.charAt(i));
            }
        }    
        return l1.toString();
    }
}