class Solution {
    public boolean isPalindrome(String s) {
        String cl2=s.replaceAll("[^a-zA-z0-9]","").toLowerCase();
        String rev=new StringBuilder(cl2).reverse().toString();
        if(cl2.equals(rev)){
            return true;
        }
        return false;

        
    }
}
