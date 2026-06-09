class Solution {
    public boolean isPalindrome(String s) {
     String cl2 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
     char[] charArray=cl2.toCharArray();

     int l=0;
     int r=charArray.length-1;
     while(l<r){
        char temp=charArray[l];
        charArray[l]=charArray[r];
        charArray[r]=temp;
        l++;
        r--;
     }
     String reversed=new String(charArray);
     System.out.println(reversed);
     return cl2.equals(reversed);


     }
}  
