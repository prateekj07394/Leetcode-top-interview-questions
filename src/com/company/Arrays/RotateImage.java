package com.company.Arrays;

import java.util.Arrays;

public class RotateImage {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        boolean newArr = true;
        if(digits[digits.length-1]==9){
            carry = 1;
            for(int i = 0;i < digits.length;i++){
                if(digits[i]!=9){
                    newArr = false;
                    break;
                }
            }
        }


        if(carry==0){
            digits[digits.length-1] = digits[digits.length-1]+1;
            return digits;
        }else{
            //now check if new array is required or not
            if(newArr){
                //all are nines
                int[] ans = new int[digits.length+1];
                ans[0] = 1;
                for(int i = 0;i<digits.length;i++){
                    ans[1+i] = 0;
                }
                return ans;
            }else{
                //all are not nines, just check for carries
                for(int i = digits.length-1;i>=0;i--){
                    if(carry==1){
                        if(digits[i]!=9){
                            digits[i] = digits[i]+1;
                            carry = 0;
                        }else{
                            digits[i] = 0;

                        }
                    }else{
                        break;
                    }

                }

            }
        }
        return digits;
    }
}
