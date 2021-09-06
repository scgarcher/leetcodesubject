package com.scg.questionbank;

/**
 * 求一个数的平方根
 * Math.sqrt()
 */
public class N69 {
    public static int mySqrt(int x) {
        int left = 0,right = x,ans =-1;

        while(left <= right){
            int mid =left+ (right-left)/2;
            if((long)mid * mid <=x){
                ans = mid;
                left = mid+1;
            }else{
                right = mid-1;
            }

        }


        return ans;
    }




    public static void main(String[] args) {
        int i = mySqrt(5);
        System.out.println(i);
    }
}
