package Math;

/**
 * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 * @author keyboardhero
 * @create 2022-05-10 22:16
 */
public class _268_simple {
    //数学方法，求和作差
    public int missingNumber(int[] nums) {
        int sum1=nums.length*(nums.length+1)/2;
        int sum2=0;
        for(int num:nums){
            sum2+=num;
        }
        return sum1-sum2;
    }

    public int missingNumber_rev1(int[] nums){
        int sum1=nums.length*(nums.length+1)/2;
        int sum2=0;
        for(int num:nums){
            sum2+=num;
        }
        return sum1-sum2;
    }
}
