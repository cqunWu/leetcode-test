package com.easy;

/**
 * @author: Chaoqun Wu
 * @description 回文数测试
 * @date: 2023/2/17 17:01
 */
public class Solution2 {
    public static boolean isPalindrome(int x) {
        String tmp = String.valueOf(x);
        for (int i = 0; i < tmp.length() / 2; i++) {
            if (tmp.charAt(i) != tmp.charAt(tmp.length() - 1 - i )) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int i = -1;
        System.out.println(isPalindrome(i));
    }


}
