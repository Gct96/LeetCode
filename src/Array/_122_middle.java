package Array;

/**
 * 给你一个整数数组 prices ，其中prices[i] 表示某支股票第 i 天的价格。
 * 在每一天，你可以决定是否购买和/或出售股票。你在任何时候最多只能持有 一股 股票。你也可以先购买，然后在 同一天 出售。
 * 返回 你能获得的最大利润
 * @author keyboardhero
 * @create 2022-06-30 16:19
 */
public class _122_middle {
    //最简化的贪心算法
    public int maxProfit(int[] prices) {
        int total = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            total+=Math.max(prices[i+1]-prices[i],0);
        }
        return total;
    }
}
