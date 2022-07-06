package Array;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出和为目标值 target的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * @author keyboardhero
 * @create 2022-05-01 17:00
 */
public class _1_simple {
    /**
     * 暴力求解
     * @param nums
     * @param target
     * @return
     */
    @Test
    public int[] twoSum_1(int[] nums, int target) {
        int k=0;
        int [] res=new int[2];  //数组对象需实例化
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    res[k++]=i;
                    res[k++]=j;
                }
            }
        }
        return res;
    }

    /**
     * 时间复杂度为O(n)的哈希表求解
     * @param nums
     * @param target
     * @return
     */
    @Test
    public int[] twoSum_2(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 1; i < nums.length; ++i) {
           if (hashtable.containsKey(target - nums[i]))
                return new int[]{hashtable.get(target - nums[i]), i};
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

    /**
     * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出和为目标值 target的那两个整数，并返回它们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     */
    public int[] twoSum_2_rev1(int[] nums,int target){
        Map<Integer,Integer> hashtable=new HashMap<Integer, Integer>();
        for(int i=1;i<nums.length;++i){
            if(hashtable.containsKey(target-nums[i]))
                return new int[]{hashtable.get(target - nums[i]),i};
            hashtable.put(nums[i],i);
        }
        return new int[0];
    }
}


