package com.scg.questionbank;

/**
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 */
public class N67 {
    public String addBinary(String a, String b) {

        int a_len = a.length();
        int b_len = b.length();
        int d = 0,curA= a_len -1,curB = b_len -1;
        StringBuilder build = new StringBuilder();
        while(d>0 || curA >= 0 || curB>=0){
            int fistVal   = curA<0?0:a.charAt(curA--) - '0';
            int secondVal = curB<0?0:b.charAt(curB--) - '0';
            int sum = fistVal+secondVal+d;
            d = sum /2;
            int ans = sum%2;
            build.insert(0,ans);
        }
        return build.toString();

    }
}
