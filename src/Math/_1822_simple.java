package Math;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * 已知函数signFunc(x) 将会根据 x 的正负返回特定值：
 * 如果 x 是正数，返回 1 。
 * 如果 x 是负数，返回 -1 。
 * 如果 x 是等于 0 ，返回 0 。
 * 给你一个整数数组 nums 。令 product 为数组 nums 中所有元素值的乘积。
 * 返回 signFunc(product)
 * @author keyboardhero
 * @create 2022-06-22 20:09
 */
public class _1822_simple {
    public int arraySign(int[] nums) {
        int count=0;
        for(int k=0;k<nums.length;k++){
            if(nums[k]==0)
                return 0;
            else if(nums[k]<0)
                count++;
            else
                continue;
        }
        if(count%2==0)
            return 1;
        else
            return -1;
    }

    @Test
    public void test(){
        int[] nums=new int[]{1,5,0,2,-3};
        int i = arraySign(nums);
        System.out.println(i);
    }
}
