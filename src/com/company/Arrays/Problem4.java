package com.company.Arrays;

import java.util.HashMap;
import java.util.Map;

public class Problem4 {

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            System.out.println("i is "+nums[i]+map);
            if(map.containsKey(nums[i])){
                System.out.println("inside if "+nums[i]);
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                System.out.println("inside else "+nums[i]);
                map.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                return true;
            }
        }
        return false;
    }
    public static long sumOfEvenFibo() {
        long fiboAns = 0;
        long sum = 0;
        int firstVal = 1;
        int secondVal = 2;
        for (int i = 0; (firstVal + secondVal) < 4000000; i++) {
            fiboAns = firstVal + secondVal;
            if (fiboAns % 2 == 0) {
                sum += fiboAns;
            }
            firstVal = secondVal;
            secondVal = (int) fiboAns;
        }
        return sum + 2;
    }
    public static void main(String[] args){
        System.out.println(containsDuplicate(new int[]{7,10,5,5,6,6,4,10,5,4,9,4,9,6,5,9,6,3,6,5,6,7,7,4,9,9,10,5,8,1,8,3,2,7,5,10,1,8,5,8,4,3,6,4,9,4,2,8,3,2,2,1,5,6,3,2,6,1,8,6,2,9,1,4,5,10,8,5,10,5,10,1,4,8,3,6,4,10,9,1,1,1,2,2,9,6,6,8,1,9,2,5,5,2,1,8,5,2,3,10}));
    }

}
