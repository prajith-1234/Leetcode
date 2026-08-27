class Solution {
    public char findTheDifference(String s, String t) {
    int sum = 0;
    int sum1 = 0;
    int m=0;
    for(char c : s.toCharArray())
    {
        int a = c;
        sum += a;
    }
    for(char ch : t.toCharArray())
    {
        int b = ch;
        sum1 += b;
    }
    m = sum1 - sum;
    return (char)m;
    }
}