package com.scg.questionbank;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 */
public class N66 {
    // 只是加1 的情况 （题解中思路）
    public int[] plusOne(int[] digits) {
        int  len = digits.length;
        for(int i = len -1;i>=0;i--){
            //  因为是加1 所以每一位最多加1  也就是有近卫也只能是进1位
            digits[i]++;
            //  当为9 的时候会有进位,（有进位时肯定位0）
            digits[i] = digits[i]%10;
            if(digits[i] != 0){
                return digits;
            }

        }
        //  这种情况只有 全是9 的时候才会出现 最高位1 其余都是0
        digits = new int[len+1];
        digits[0] = 1;

        return digits;
    }



    // 适用于加n，如果加的 是大于1的 则把d 改为 n
    public int[] plusOne1(int[] digits) {
        List<Integer> ans = new ArrayList<Integer>();
        int len = digits.length;
        int d = 1;
        int cur =len -1;
        while(d>0 || cur>=0){
            if(cur<0){
                ans.add(0,d);
                break;
            }
            int sumVal = digits[cur--] +d;
            d = sumVal /10;
            int nextVal = sumVal % 10;
            ans.add(0,nextVal);
        }
        int[] ints = ans.stream().mapToInt(i -> i).toArray();
        return ints;
    }
}
