class Solution {
    public boolean isValid(String s) {
        
        
        
        Stack<Character> openBrackets = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            
            switch(a) {
                case '(':
                case '{':
                case '[':
                    openBrackets.push(a);
                    break;
                case ')':
                    if(openBrackets.isEmpty() || openBrackets.pop() != '(') return false;
                    break;
                case '}':
                    if(openBrackets.isEmpty() || openBrackets.pop() != '{') return false;
                    break;
                case ']':
                    if(openBrackets.isEmpty() || openBrackets.pop() != '[') return false;
                    break;
            }
        }
        return openBrackets.isEmpty();
    }
}