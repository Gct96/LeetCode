package Array;

/**
 * 给定一个包含红色、白色和蓝色、共 n 个元素的数组nums，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 *
 * 我们使用整数 0、1 和 2 分别表示红色、白色和蓝色。
 *
 * 必须在不使用库的sort函数的情况下解决这个问题。
 *
 * @author keyboardhero
 * @create 2022-10-31 11:08
 */
public class _75_middle {
    public void sortColors(int[] nums) {
        int redIndex=0;
        int blueIndex=nums.length-1;
        for(int i=0;i<blueIndex+1;i++){
            if(nums[i]==0){
                int tmp=nums[redIndex];
                nums[redIndex++]=nums[i];
                nums[i]=tmp;
            }else if(nums[i]==2){
                int tmp=nums[blueIndex];
                nums[blueIndex--]=nums[i];
                nums[i]=tmp;
                i--;   //因为下标i的值是交换之后的新值，还未遍历，故往前一位。
            }
        }
    }
}
