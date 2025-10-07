package leetcodes;

public class CheckForSortedAndRotatedArray {
    public boolean check(int[] nums) {
        int pivots=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] > nums[(i+1)%n]){
                pivots++;
            }
            if(pivots>1){
                return false;
            }
        }    
        return true;
    }
}
