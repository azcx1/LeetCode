int maxAscendingSum(int* nums, int numsSize) {
    int sum=nums[0], max=nums[0];
    for(int i=1;i<numsSize;i++) {
        
        if(nums[i]>nums[i-1]) {
            sum+=nums[i];
        }else{
            if(sum>max) {
                max=sum;
            }
            sum = nums[i];
        }
            if(sum>max) {
                max=sum;
            }
    }
    return max;
}
