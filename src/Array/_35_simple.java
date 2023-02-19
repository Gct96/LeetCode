package Array;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 请必须使用时间复杂度为 O(log n) 的算法。

 * @author keyboardhero
 * @create 2023-02-19 14:18
 */
public class _35_simple {
    //二分查找法
    public int searchInsert(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(nums[mid]>target)
                right=mid-1;
            else if(nums[mid]<target)
                left=mid+1;
            else
                return mid;
        }
        return left;
    }
}
