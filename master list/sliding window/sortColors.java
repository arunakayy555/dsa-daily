class sortColors {
    public void sortColours(int[] nums) {
        /**
        1. two pointers
        2. to push 0 to front, then to push 2 to end, 1 remains in the mid space
         */
         int left = 0;
         int curr = 0;
         int mid=nums.length-1;
         while(curr <= mid){ //i did not include the = there
            if(nums[curr]==2)
            {
                swap(curr,mid,nums);
                mid--;
            }
            else if(nums[curr]==0){
                swap(curr, left, nums);
                left++;
                curr++;//imp to move curr forward too, because we have dealt w left alrdy so no need to consider it again
            }
            else{
                curr++;
            }
         }
    }
    public void swap(int a, int b, int[]nums){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}