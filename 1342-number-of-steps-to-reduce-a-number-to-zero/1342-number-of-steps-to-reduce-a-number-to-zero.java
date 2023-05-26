class Solution {
    public int numberOfSteps(int num) {
        
        int stepCount = 0;
        
        while(num != 0) {
            if((num % 2) == 0) {
                num /= 2;
                stepCount++;
            }
            if((num % 2) == 1) {
                num -= 1;
                stepCount++;
            }
        }
        
        return stepCount;
    }
}