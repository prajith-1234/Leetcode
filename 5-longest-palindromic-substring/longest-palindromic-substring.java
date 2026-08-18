class Solution {
    public String longestPalindrome(String s) {
        String k = "";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                String c = s.substring(i,j+1);
                if(isPalin(c) && c.length()>k.length())
                {
                    k = c;
                }
            }
        }
        return k;       
    }
    static boolean isPalin(String s)
    {
        int start = 0;
        int end = s.length()-1;
        while(start < end)
        {
            if(s.charAt(start) != s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    } 
}