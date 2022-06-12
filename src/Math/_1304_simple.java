package Math;

/**
 * 给你一个整数 n，请你返回 任意 一个由 n 个 各不相同 的整数组成的数组，并且这 n 个数相加和为 0 。
 * @author keyboardhero
 * @create 2022-06-12 15:11
 */
public class _1304_simple {
    public int[] sumZero(int n) {
        int[] nums=new int[n];
        if(n==1){
            nums[0]=0;
            return nums;
        }
        if(n%2!=0) {
            for (int i = 0, k = 1; i < n - 1; i += 2, k++) {
                nums[i] = k;
                nums[i + 1] = -k;
            }
            nums[n-1]=0;
        }else{
            for (int i = 0, k = 1; i < n - 1; i += 2, k++) {
                nums[i] = k;
                nums[i + 1] = -k;
            }
        }
        return nums;
    }
}
