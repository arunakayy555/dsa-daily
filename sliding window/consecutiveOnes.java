class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        /*
        1. we use 2 pointers 
        2. one of it moves when there's a 0 encounter to start off all over again in counting max con ones
        3. the other one to iterate 
        
        int i=0; int count=0; int maxCount=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==1){
                count++;
            }
            else{
                count=0;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
        */
        int right=0;int count=0;int maxCount=0;
            while(right<nums.length)
            {
                if(nums[right]==1){
                count++;
                maxCount = Math.max(count, maxCount);
                right++;
                }
                else{
                    count=0;
                    right++;
                }
            }
            //if(nums[right]!=1) 
        
        return maxCount;
        
    }
}