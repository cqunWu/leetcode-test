package com.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author: Chaoqun Wu
 * @description 有效括号的判断
 * @date: 2023/2/18 10:29
 */
public class Solution5 {
    public static boolean isValid(String s) {
        boolean flag = false;
        char[] chars = s.toCharArray();
        if(chars.length == 1) {
            return flag;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{') {
                stack.add(chars[i]);
            } else if (!stack.isEmpty() && chars[i] == ')' && stack.peek() == '(') {
                stack.pop();
            }else if (!stack.isEmpty() && chars[i] == ']' && stack.peek() == '[') {
                stack.pop();
            }else if (!stack.isEmpty() && chars[i] == '}' && stack.peek() == '{') {
                stack.pop();
            } else {
                return flag;
            }
        }
        if (stack.isEmpty()) {
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
        String str = "(]";
        System.out.println(isValid(str));

    }

}
