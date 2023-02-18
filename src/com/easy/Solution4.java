package com.easy;

/**
 * @author: Chaoqun Wu
 * @description 编写一个函数来查找字符串数组中的最长公共前缀
 * @date: 2023/2/18 9:56
 */
public class Solution4 {
    public static String longestCommonPrefix(String[] strs) {
        String res = "";
        if (strs == null) {
            return  res;
        } else if (strs.length == 1) {
            return strs[0];
        }
        res = strs[0];
        for (int i = 1; i < strs.length ; i++) {
            if (res.equals("")) {
                return res;
            }
            String tmp1 = strs[i];
            char[] charArray1 = tmp1.toCharArray();
            char[] charArray2 = res.toCharArray();
            StringBuilder restmp = new StringBuilder();
            int tmplength = charArray1.length > charArray2.length ? charArray2.length : charArray1.length;
            for(int j = 0; j< tmplength; j++){
                if(charArray1[j] == charArray2[j]) {
                    restmp.append(charArray1[j]);
                } else {
                    break;
                }
            }
            res = restmp.toString();
        }
        return res;

    }
    public static void main(String[] args) {
        String [] strs = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));

    }
}
