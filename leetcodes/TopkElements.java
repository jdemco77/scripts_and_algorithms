package leetcodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;


import java.util.Map.Entry;

public class TopkElements {
    
    public static int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 0) return new int[]{};
        if (nums.length == 1) return new int[]{nums[0]};
    
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        TreeSet<Integer> tree = new TreeSet<>((a, b) -> {
            int freqCompare = map.get(a).compareTo(map.get(b));
            return freqCompare != 0 ? freqCompare : a.compareTo(b);
        });

        for (int num : map.keySet()) {
            tree.add(num);
            if (tree.size() > k) {
                tree.pollFirst(); 
            }
        }

        int[] answer = new int[k];
        Iterator<Integer> iterator = tree.iterator();
        for (int i = 0; i < k; i++) {
            answer[i] = iterator.next();
        }
    
        return answer;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,3,3,3};
        int k = 2;
        int[] answer =topKFrequent(nums, k);
        for (int i : answer) {
            System.out.println(i);
        }

        System.out.println();

        int[] nums2 = new int[]{7,7};
        int k2 = 1;
        int[] answer2 = topKFrequent(nums2, k2);
        for (int i : answer2) {
            System.out.println(i);
        }
    }
}
