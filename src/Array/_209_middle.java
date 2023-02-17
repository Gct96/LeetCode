package Array;

/**给定一个含有n个正整数的数组和一个正整数 target 。
 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组[numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0

 * @author keyboardhero
 * @create 2023-02-16 15:43
 */
public class _209_middle {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0,right=0,sum=0;
        int len=nums.length+1;
        while(right<nums.length){
            sum+=nums[right];
            if(sum>=target){
                while(left<=right){
                    if(sum>=target) {
                        if (right - left + 1 < len)
                            len = right - left + 1;
                    }
                    else{
                        break;
                    }
                    sum-=nums[left];
                    left++;
                }
            }
            right++;
        }
        return len==nums.length+1?0:len;
    }
}
