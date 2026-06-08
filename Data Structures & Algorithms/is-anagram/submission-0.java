class Solution {
    public boolean isAnagram(String s, String t) {

        char[] C1a=s.toCharArray();
        char[] C1b=t.toCharArray();
        Arrays.sort(C1a);
        Arrays.sort(C1b);
        return Arrays.equals(C1a,C1b);
        

    }
}
