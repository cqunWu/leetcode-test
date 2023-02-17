package com.easy;

import java.util.HashSet;

/**
 * @author: Chaoqun Wu
 * @description
 * @date: 2023/2/16 10:53
 */
public class Solution {
    public static int[] numberOfPairs(int[] nums) {
        int count = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i : nums) {
            if (hashSet.contains(i)) {
                hashSet.remove(i);
                count++;
            } else {
                hashSet.add(i);
            }
        }
        return new int[]{count, hashSet.size()};

    }

    public static void main(String[] args) {
        int[] nums  = new int[]{1,3,2,1,3,2,2};
        int[] res = numberOfPairs(nums);
        System.out.println((res[0]) +","+ res[1]);

    }
}
