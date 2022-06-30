package Array;

/**
 * 给你一个 升序排列 的数组 nums ，请你原地删除重复出现的元素，使每个元素只出现一次 ，返回删除后数组的新长度。元素的相对顺序
 * 应该保持 一致 。
 * 由于在某些语言中不能改变数组的长度，所以必须将结果放在数组nums的第一部分。更规范地说，如果在删除重复项之后有 k 个元素，
 * 那么nums的前 k 个元素应该保存最终结果。
 *
 * 将最终结果插入nums 的前 k 个位置后返回 k 。
 *
 * 不要使用额外的空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成
 *
 * @author keyboardhero
 * @create 2022-06-30 16:01
 */
public class _26_simple {
    //快慢指针
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        int left=0;
        for(int right=1;right<nums.length;right++){
            if(nums[left]!=nums[right])
                nums[++left]=nums[right];
        }
        return ++left;
    }
}
