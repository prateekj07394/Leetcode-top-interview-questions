package com.company.String;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class StringToInteger {

    public static int maxGap(){
        //1 12 33 42 55 83
        int[] nums = new int[]{1,3,100};
        int ans = 0; int max = 0;
        int start = 0; int end = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int maxVal = 0;

        for(int i = 0;i<nums.length;i++){
            arrayList.add(nums[i]);
            if(nums[i]>maxVal){
                maxVal = nums[i];
            }
        }
        int counter = 1;
        for(int i = 1;i<=maxVal;i++){

            if(arrayList.contains(i)){


                if(ans>max){
                    max = ans;
                }
                counter++;
            }
        }
        return max;
    }


    public static int myAtoi(String str) {
        str = str.trim();
        int ans = 0;
        String[] arr = str.split(" ");
        boolean negative = false;
        int sum = 0;
        int prevNum = 0;

        for (int i = 0; i < arr[0].length(); i++) {

            if (i == 0 && arr[0].charAt(i) == '-') {
                negative = true;
                continue;
            }
            if (i == 0 && arr[0].charAt(i) == '+') {
                continue;
            }

            if (arr[0].charAt(i) > '9' || arr[0].charAt(i) < '0') {
                break;
            } else {
                // write code here
                int currentDigit = arr[0].charAt(i) - '0';

                if (prevNum > Integer.MAX_VALUE / 10) {
                    if (negative) {
                        return Integer.MIN_VALUE;
                    }
                    return Integer.MAX_VALUE;
                } else if (prevNum == Integer.MAX_VALUE / 10) {
                    if (negative && currentDigit >= 8) {
                        return Integer.MIN_VALUE;
                    } else if (currentDigit > 7) {
                        return Integer.MAX_VALUE;
                    }
                }

                sum = currentDigit + prevNum * 10;
                prevNum = sum;
            }
        }
        if (negative) {
            return -sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(maxGap());
    }
}
