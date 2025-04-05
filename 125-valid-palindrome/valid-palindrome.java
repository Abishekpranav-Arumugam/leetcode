class Solution
{
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(Character.isLetterOrDigit(c))
            {
                sb.append(Character.toLowerCase(c));
            }
        }
        String f=sb.toString();
        String b=sb.reverse().toString();

        return f.equals(b);
    }
}