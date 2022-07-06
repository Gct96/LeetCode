package Array;

/**给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作
 * @author keyboardhero
 * @create 2022-07-05 10:21
 */
public class _283_simple {
    //把非零的往前挪
    public void moveZeroes(int[] nums) {
        if(nums==null||nums.length==0)
            return;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
                nums[index++]=nums[i];
        }
        while(index<nums.length){
            nums[index++]=0;
        }
    }
}
