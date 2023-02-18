package com.easy;

import java.util.HashMap;

/**
 * @author: Chaoqun Wu
 * @description 测试罗马数字转整数
 * @date: 2023/2/17 17:23
 */
public class Solution3 {
    public static int romanToInt(String s) {
        int res = 0;
        HashMap<Character , Integer> hashMap = new HashMap();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        char [] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i != chars.length -1) {
                if (chars[i] == 'I' && (chars[i + 1] == 'V' || chars[i + 1] == 'X')) {
                    res -= 2;
                } else if (chars[i] == 'X' && (chars[i + 1] == 'L' || chars[i + 1] == 'C')) {
                    res -= 20;
                } else if (chars[i] == 'C' && (chars[i + 1] == 'D' || chars[i + 1] == 'M')) {
                    res -= 200;
                }
            }
              res += hashMap.get(chars[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        String input = "MCMXCIV";
        System.out.println(romanToInt(input));

    }
}
