class Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int pt1 = 0;
        for(int pt2=0; pt2<nums.length; pt2++){
            if(nums[pt2] != 0){
                
                int temp = nums[pt1];
                nums[pt1] = nums[pt2];
                nums[pt2] = temp;

                pt1++;
            }
        }
    }
}