class Remove_duplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){ return 0;}
        int pt1 = 0;
        for(int pt2=1; pt2<nums.length; pt2++){
            if(nums[pt1] != nums[pt2]){
                pt1++;
                nums[pt1] = nums[pt2];
            }
        }
        return pt1 + 1;
    }
}