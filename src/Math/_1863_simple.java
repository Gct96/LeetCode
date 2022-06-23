package Math;

/**
 * 一个数组的 异或总和 定义为数组中所有元素按位 XOR 的结果；如果数组为空 ，则异或总和为 0 。
 * 例如，数组[2,5,6] 的 异或总和 为 2 XOR 5 XOR 6 = 1 。
 * 给你一个数组 nums ，请你求出 nums 中每个子集的异或总和 ，计算并返回这些值相加之和 。
 * 注意：在本题中，元素 相同 的不同子集应多次计数。
 * 数组 a 是数组 b 的一个子集的前提条件是：从b删除几个（也可能不删除）元素能够得到 a
 * @author keyboardhero
 * @create 2022-06-23 17:09
 */
public class _1863_simple {
    int res = 0;

    public int subsetXORSum(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        dfs(nums, 0, 0);
        return res;
    }

    //i：表示来到第i个位置，xor_sum代表每个子集的异或和
    public void dfs(int[] nums, int i, int xor_sum) {
        if (i == nums.length) {
            res += xor_sum;
            return;
        }
        //当前位置要
        dfs(nums, i + 1, xor_sum ^ nums[i]);
        //当前位置不要
        dfs(nums, i + 1, xor_sum);
    }
}

