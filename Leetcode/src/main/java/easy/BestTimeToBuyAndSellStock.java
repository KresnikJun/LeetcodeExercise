package easy;

/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) {
            return 0;
        }
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int x : prices) {
            if (x < minPrice) {
                minPrice = x;
            } else if (x - minPrice > maxProfit) {
                maxProfit = x - minPrice;
            }
        }
        return maxProfit;
    }
}
