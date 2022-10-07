package Dynamicprogramming;

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额
 * @author keyboardhero
 * @create 2022-10-07 11:16
 */
public class _198_middle {
    /**
     * 动态规划
     * 状态条件：
     * 定义一个二维数组dp[len][2]，dp[i][0]代表第i家没偷情况的最大值，dp[i][1]代表第i家偷了情况的最大值
     * 转移公式：
     * dp[i][0]=max(dp[i-1][0],dp[i-1][1])
     * dp[i][1]=dp[i-1][0]+nums[i]
     * 边界条件
     * dp[0][0]=0,dp[0][1]=nums[0]
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int length=nums.length;
        int[][]dp=new int[length][2];
        dp[0][0]=0;
        dp[0][1]=nums[0];
        for(int i=1;i<length;i++){
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]);
            dp[i][1]=dp[i-1][0]+nums[i];
        }
        return Math.max(dp[length-1][0],dp[length-1][1]);
    }
}
