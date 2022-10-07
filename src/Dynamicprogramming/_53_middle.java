package Dynamicprogramming;

/**给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *子数组 是数组中的一个连续部分。
 * @author keyboardhero
 * @create 2022-10-07 10:38
 */
public class _53_middle {
    /**动态规划
     状态条件：dp[i]表示右端点为i的子序的最大和。
     转移公式：dp[i-1]若大于0，则继续加num[i]，否则舍弃，重新计算，因为dp[i-1]小于0，会越加越小。
     边界条件：dp[0]=num[0]，max=dp[0]
     */
    public int maxSubArray(int[] nums) {
        //临时变量cur代表dp[i]和dp[i-1]
        int length=nums.length;
        int cur=nums[0];
        int max=cur;
        for(int i=1;i<nums.length;i++){
            cur=Math.max(cur,0)+nums[i]; //dp[i-1]若大于0，则继续加num[i]，否则舍弃，重新计算
            max=Math.max(cur,max);  //记录最大值
        }
        return max;
    }
}
