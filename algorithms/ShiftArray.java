package algorithms;
public class ShiftArray{

    public static void shiftArrayByOne(int[] nums){
        int len=nums.length;
        if (nums.length <= 1){
            return;
        } 
        
        int hold= nums[len-1];
        for(int i=len-1;i>0;i--){
            nums[i]=nums[i-1];
        }
        nums[0]=hold;
    }

    public static void shiftArrayByN(int[] nums,int n){
        for(int i=0;i<n;i++){
            shiftArrayByOne(nums);
        }
    }
      public static void main(String[] args) {
        int[] tester= new int[]{1,2,3,4,5,6};
        int[] edgeTest= new int[]{1,2};
        
        shiftArrayByOne(tester);

        for (int i : tester) {
            System.out.println(i);   
        }

        shiftArrayByOne(edgeTest);
        System.out.println();
        for (int i : edgeTest) {
            System.out.println(i);   
        }
        System.out.println();
        int[] tester2= new int[]{1,2,3,4,5,6};
        shiftArrayByN(tester2,3);

        for (int i : tester2) {
            System.out.println(i);   
        }
    }
}

