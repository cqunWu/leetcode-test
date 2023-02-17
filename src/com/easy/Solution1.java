package com.easy;

import java.util.HashMap;

/**
 * @author: Chaoqun Wu
 * @description
 * @date: 2023/2/17 10:19
 */
public class Solution1 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // 如果存在值为target - 之前的值
            if (hashMap.containsKey(target - nums[i])){
                return new int[]{hashMap.get(target - nums[i]), i};
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int [] nums = new int []{2,7,11,15};
        int target = 9;
        int[] res = twoSum(nums, target);
        System.out.println((res[0]) +","+ res[1]);

    }
}
