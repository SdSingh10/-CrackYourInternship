class SortColors {
    public void sortColors(int[] nums) {
        int zeroes = 0;
        int ones = 0;
        int twos = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                zeroes++;
            }
            else if(nums[i] == 1){
                ones++;
            }
            else if(nums[i] == 2){
                twos++;
            }
        }
        int i = 0;
        int j = 0;
        while(j < zeroes){
            nums[i] = 0;
            i++;
            j++;
        }
        j = 0;
        while(j < ones){
            nums[i] = 1;
            i++;
            j++;
        }
        j = 0;
        while(j < twos){
            nums[i] = 2;
            i++;
            j++;
        }
    }
}