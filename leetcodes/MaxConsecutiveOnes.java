package leetcodes;

public class MaxConsecutiveOnes{
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int curr=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){ 
                curr++;
                if(curr>max) max=curr;
                continue;
            }
            if(nums[i]==0 || i==nums.length-1){
                curr=0;
                continue;
            } 
        }
        return max;
    }

}