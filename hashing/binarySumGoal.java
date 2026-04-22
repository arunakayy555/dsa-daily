import java.util.HashMap;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        /**
        1. init a hashmap - to store sums and their frequencies
        2. init sum and count
        3. traverse thru the array and          */
        int sum=0;
        int count=0;
        HashMap<Integer, Integer>map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-goal)){
                count+=map.get(sum-goal);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;

        
    }
}