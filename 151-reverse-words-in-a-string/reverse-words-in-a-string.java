class Solution {
    public String reverseWords(String s) {
        String l = s.trim();
        String[] n = l.split("\\s+");
        String f ="";
        int k =0;
        for(int i= n.length-1;i>=0;i--)
        {
            f = f+" "+n[i];
        }
        return f.trim();
        
    }
}