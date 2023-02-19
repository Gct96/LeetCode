package Array;

/**
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 * @author keyboardhero
 * @create 2023-02-19 15:27
 */
public class _977_simple {
    //双指针归并排序
    public int[] sortedSquares(int[] nums) {
        int len=nums.length;
        int []res=new int[len];
        int i=0,j=len-1,k=len-1;
        while(i<=j){
            if(nums[i]*nums[i]>=nums[j]*nums[j]) {
                res[k--] = nums[i] * nums[i];
                i++;
            }
            else{
                res[k--] = nums[j] * nums[j];
                j--;
            }
        }
        return res;
    }
}
