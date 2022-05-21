package Math;

import java.util.Arrays;

/**
 * 给你一个整型数组 nums,在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 * @author keyboardhero
 * @create 2022-05-21 15:22
 */
public class _628_simple {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return Math.max(nums[0]*nums[1]*nums[n-1],nums[n-1]*nums[n-2]*nums[n-3]);
    }
}
