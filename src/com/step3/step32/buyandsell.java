package com.step3.step32;

public class buyandsell {public static int bestTimeToBuyAndSellStock(int []prices) {
    // Write your code here.
    int n=prices.length;

    if (prices.length == 0) {
        return 0; // If empty, return 0 profit
    }


    int []x=new int[1];

    int min=prices[0];
    int maxProfit=0;
    for(int i=0;i<n;i++){
        if(prices[i]<min){min=prices[i];}
        else if (prices[i]-min>maxProfit){
            maxProfit=prices[i]-min;
        }
    }
    return maxProfit;
}
}
