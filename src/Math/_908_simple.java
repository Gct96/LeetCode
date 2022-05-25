package Math;

import java.util.Arrays;

/**
 * 给你一个整数数组 nums，和一个整数 k 。
 * 在一个操作中，您可以选择 0 <= i < nums.length 的任何索引 i 。将 nums[i] 改为 nums[i] + x ，其中 x 是一个范围为 [-k, k] 的
 * 整数。对于每个索引 i ，最多只能应用一次此操作。
 * nums的分数是nums中最大和最小元素的差值。
 * 在对nums 中的每个索引最多应用一次上述操作后，返回nums的最低分数 。
 * @author keyboardhero
 * @create 2022-05-24 15:34
 */
public class _908_simple {
    public int smallestRangeI(int[] nums, int k) {
        int minNum = Arrays.stream(nums).min().getAsInt();
        int maxNum = Arrays.stream(nums).max().getAsInt();
        return maxNum - minNum <= 2 * k ? 0 : maxNum - minNum - 2 * k;
    }

    /**
     *  * 给你一个整数数组 nums，和一个整数 k 。
     *  * 在一个操作中，您可以选择 0 <= i < nums.length 的任何索引 i 。将 nums[i] 改为 nums[i] + x ，其中 x 是一个范围为 [-k, k] 的
     *  * 整数。对于每个索引 i ，最多只能应用一次此操作。
     *  * nums的分数是nums中最大和最小元素的差值。
     *  * 在对nums 中的每个索引最多应用一次上述操作后，返回nums的最低分数 。
     */
    public int smallestRangeI_rev1(int[] nums, int k){
        int minNum=Arrays.stream(nums).min().getAsInt();
        int maxNum=Arrays.stream(nums).max().getAsInt();
        return maxNum-minNum <= 2 * k ? 0 : maxNum - minNum - 2 * k;
    }
}
