class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap();
        
        for(int i = 0; i < nums.length; i++) {
            // Check if map contains key equal to current num
            if(map.containsKey(nums[i])) {
                return new int[] {map.get(nums[i]), i};
            }
            // target - current num = complementary num
            // Add complementary num to map as key & index of current num as value
            map.put(target - (nums[i]), i);
            
        }
        return null;
    }
}