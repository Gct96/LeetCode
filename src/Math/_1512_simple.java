package Math;

import org.junit.Test;

/**
 * 给你一个整数数组 nums 。
 * 如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。
 * 返回好数对的数目。
 * @author keyboardhero
 * @create 2022-06-15 19:28
 */
public class _1512_simple {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }

    @Test
    public void test(){
        int[] nums=new int[]{1,2,3,1,1,3};
        int i = numIdenticalPairs(nums);
        System.out.println(i);
    }
}
