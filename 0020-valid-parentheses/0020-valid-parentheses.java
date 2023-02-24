class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> openBrackets = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            
            if(a == '(' || a == '{' || a == '[') openBrackets.push(a);
            else if(openBrackets.empty()) return false;
            else if(a == ')' && openBrackets.pop() != '(') return false;
            else if(a == '}' && openBrackets.pop() != '{') return false;
            else if(a == ']' && openBrackets.pop() != '[') return false;
        }
        return openBrackets.empty();
    }
}