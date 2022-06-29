package Math;

/**
 * 给你一个整数数组 nums ，返回数组中最大数和最小数的 最大公约数 。
 * 两个数的 最大公约数 是能够被两个数整除的最大正整数。
 * @author keyboardhero
 * @create 2022-06-29 19:47
 */
public class _1979_simple {
    public int findGCD(int[] nums) {
        int max=0,min=1000;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max)
                max=nums[i];
            if(nums[i]<min)
                min=nums[i];
        }
        int gcd = gcd(min, max);
        return gcd;
    }

    private int gcd(int x, int y) {  //辗转相除法求最大公约数
        return x == 0 ? y : gcd(y % x, x);
    }

}
