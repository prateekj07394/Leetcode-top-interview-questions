package com.company.Arrays;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {

        String s = "";
        for(int i = 0;i<digits.length;i++){
            s += digits[i];
        }
        int num = Integer.parseInt(s);
        num=num+1;
        s = num+"";
        int[] ans = new int[s.length()];
        for(int i = 0;i<s.length();i++){
            ans[i] = Integer.parseInt(s.substring(i,i+1));
        }
        return ans;
    }
    public static void main(String[] args){
        plusOne(new int[]{9,9});
    }
}
