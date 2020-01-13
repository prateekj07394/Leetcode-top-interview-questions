package com.company.Arrays;

public class Problem2 {

    public static int maxProfit(int[] prices) {
        int ans = 0;
        int startIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if(prices[i]<prices[i+1]){
                endIndex++;
                ans += prices[endIndex] - prices[startIndex];
                startIndex++;
            }else{
                ans += prices[endIndex] - prices[startIndex];
                startIndex = i+1;
                endIndex = i+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }

}
