package com.company.Arrays;


public class MoveZeroes {
    public void moveZeroes(int[] nums) {

        int count = 0;
        int startIndex = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                if(count == 0){
                    startIndex = i;
                }
                count++;
            }
        }
        if(count>0){
            for(int i = startIndex; i<nums.length;i++){
                if(nums[i]!=0){
                    nums[startIndex] = nums[i];
                    nums[i] = 0;
                    startIndex++;
                }
            }
        }

    }
}
