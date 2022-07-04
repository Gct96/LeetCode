package Array;

import sun.security.util.Length;

import java.util.Arrays;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 说明：你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * @author keyboardhero
 * @create 2022-07-04 9:58
 */
public class _136_simple {
    //先排序，再两两比较
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1)
            return nums[0];
        for(int i=0,j=1;i<nums.length&&j<nums.length;i+=2,j+=2){
            if(nums[i]==nums[j])
                continue;
            else
                return nums[i];
        }
        return nums[nums.length-1];
    }

    //异或法，相同为0，不同为1，单独的值被保留
    public int singleNumber2(int[] nums) {
        int reduce = 0;
        for (int num : nums) {
            reduce =  reduce ^ num;
        }
        return reduce;
    }


}
