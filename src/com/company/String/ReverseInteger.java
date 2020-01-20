package com.company.String;

public class ReverseInteger {
    public int reverse(int x) {
        int ans = 0;
        int remainder = 0;

        while(x!=0){
            //check for negative overflow
            if(remainder>Integer.MAX_VALUE/10 || (remainder==Integer.MAX_VALUE/10 && x%10>7)){
                return 0;
            }
            //check for positive overflow
            if(remainder<Integer.MIN_VALUE/10 || (remainder==Integer.MIN_VALUE/10 && x%10<-8)){
                return 0;
            }
            ans = x%10 + remainder*10;
            remainder = ans;
            x=x/10;
        }
        return ans;
    }

}
