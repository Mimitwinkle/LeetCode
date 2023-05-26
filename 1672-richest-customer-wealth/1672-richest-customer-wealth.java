class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int wealthiestCustomer = 0;
        
        for(int[] customer : accounts) {
            int currentCustomerWealth = 0;
            for(int bank : customer){
                currentCustomerWealth += bank;
            }
            wealthiestCustomer = Math.max(wealthiestCustomer, currentCustomerWealth);
        }
        return wealthiestCustomer;
    }
}