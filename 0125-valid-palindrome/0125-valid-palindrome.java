class Solution {
    public boolean isPalindrome(String s) {
        
        // pointer a will move from beginning, pointer b will move from end
        // compare a & b intill they equal the same or b < a
        
        if (s.length() == 1) return true;
        
        int a = 0;
        int b = s.length() - 1;
        
        while(a < b) {
            if(!Character.isLetterOrDigit(s.charAt(a))) a++;
            else if(!Character.isLetterOrDigit(s.charAt(b))) b--;
            else {
                if(a<b && Character.toLowerCase(s.charAt(a)) != Character.toLowerCase(s.charAt(b))) return false;
            a++;
            b--;
            }
        }
        return true;
    }
}