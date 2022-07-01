package Array;

import java.util.Arrays;

/**
 * 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
 * @author keyboardhero
 * @create 2022-07-01 10:30
 */
public class _217_simple {
    //暴力求解
    public boolean containsDuplicate(int[] nums) {
        for(int left=0;left<nums.length;left++) {
            for (int right = left+1; right < nums.length; right++) {
                if (nums[left] == nums[right])
                    return true;
            }
        }
        return false;
    }

    //先排序再比较
    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])
                return true;
        }
        return false;
    }
}
