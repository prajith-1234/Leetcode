class Solution {
    public int countSegments(String s) {
        String m = s.trim();
        if(m.length() == 0) return 0;
        String[] h = m.trim().split("\\s+");
        return h.length;
    }
}