package Array;

/**
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成
 * @author keyboardhero
 * @create 2022-10-25 11:26
 */
public class _80_middle {
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        else if(nums.length<=2)
            return nums.length;
        int left=2;
        for(int right=2;right<nums.length;right++){
            if(nums[right]!=nums[left-2]){
                nums[left]=nums[right];
                ++left;
            }
        }
        return left;
    }
}
