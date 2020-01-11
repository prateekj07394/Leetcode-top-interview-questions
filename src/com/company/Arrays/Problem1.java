package com.company.Arrays;

import java.util.Arrays;

public class Problem1 {

    public static int removeDuplicates(int[] nums){
        int countOfUniqueNumbers = 1;
        for(int i  = 0;i<nums.length-1;i++){
            if(nums[i] != nums[i+1]) {
                nums[countOfUniqueNumbers] = nums[i+1];
                countOfUniqueNumbers++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return countOfUniqueNumbers+1;
    }
    public static void main(String[] args){
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }
}
