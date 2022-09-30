package Dynamicprogramming;

/**
 * 给定一个数组 prices ，它的第 i个元素prices[i] 表示一支给定股票第 i 天的价格。
 * 你只能选择 某一天 买入这只股票，并选择在未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 * @author keyboardhero
 * @create 2022-09-30 10:35
 */
public class _121_simple {
    /*
        动态规划
        定义一个二维数组dp[len][2],dp[i][0]表示当天不持股的最大利润，dp[i][1]表示当天持股的最大利润。
        不持股的情况分为两种:当天没交易/当天有卖出；
        持股的情况分为两种：当天买入/当天不买入。
     */
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==0)
            return 0;
        int length=prices.length;
        int[][] dp=new int[length][2];
        //边界条件
        dp[0][0]=0;
        dp[0][1]=-prices[0];
        for(int i=1;i<length;i++){
            //递推
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]); //max(当天没交易，当天有卖出)
            dp[i][1]=Math.max(dp[i-1][1],-prices[i]);
        }
        return dp[length-1][0];
    }
}
