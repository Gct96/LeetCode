package Array;

/**
 * 给你一个整数数组nums ，请计算数组的 中心下标 。
 *
 * 数组 中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。
 *
 * 如果中心下标位于数组最左端，那么左侧数之和视为 0 ，因为在下标的左侧不存在元素。这一点对于中心下标位于数组最右端同样适用。
 *
 * 如果数组有多个中心下标，应该返回 最靠近左边 的那一个。如果数组不存在中心下标，返回 -1 。
 *

 * @author keyboardhero
 * @create 2023-02-17 20:50
 */
public class _724_simple {
    public int pivotIndex(int[] nums) {
        int sum=0,left_sum=0;
        //求数组中所有元素的总和
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        //遍历数组，如果 左和*2+当前下标元素==总和，当前下标即为中心下标
        for(int i=0;i<nums.length;i++){
            if(left_sum*2+nums[i]==sum)
                return i;
            else
                left_sum+=nums[i];
        }
        return -1;
    }
}
