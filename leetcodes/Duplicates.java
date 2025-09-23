package leetcodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {
    
    public static boolean containsDups(int[] nums){
        var map= new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],0);
        }
        return false;
    }

    // remove duplicates from int[] and keep relative order
    public static int[] removeDups(int[] nums){
        if(nums.length<2) return nums;

        Set<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        Set<Integer> seen=new HashSet<>();
        List<Integer> ls= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(seen.contains(nums[i])){
                continue;
            }
            ls.add(nums[i]);
            seen.add(nums[i]);
        }
        int[] ret= new int[seen.size()];
        for(int i=0;i<ls.size();i++){
            ret[i]= ls.get(i);
        }
        return ret;
    }

    public static void main(String[] args) {
        int dupsArr[]= new int[]{1,2,3,2,1,4,5};
        boolean flag = containsDups(dupsArr);
        System.out.println(flag);

        int[] unique= new int[]{1,2,3,4,5};
        boolean flag2 = containsDups(unique);
        System.out.println(flag2);

        dupsArr = new int[]{1,2,3,2,1,4,5};
        int[] answer= removeDups(dupsArr);
        for (int i : answer) {
            System.out.println(i);
        }
    }
}
