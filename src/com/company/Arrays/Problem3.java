package com.company.Arrays;

import java.util.Arrays;

public class Problem3 {

    public static void rotateArray(int[] nums,int k){
            //number of times rotation has to be done
            for(int i  = 0;i<k;i++){

                int prev = nums[nums.length-1];

                for(int j = 0;j < nums.length;j++){
                    int temp = nums[j];
                    nums[j] = prev;
                    prev = temp;
                }

            }
    }

    public static void main(String[] args){
        rotateArray(new int[]{1,2,3,4,5,6},3);
    }
}
