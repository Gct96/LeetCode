package Math;

/**
 * 给你一个正整数数组arr，请你计算所有可能的奇数长度子数组的和。
 * 子数组定义为原数组中的一个连续子序列。
 * 请你返回 arr中所有奇数长度子数组的和
 * @author keyboardhero
 * @create 2022-06-16 11:17
 */
public class _1588_simple {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        int n=arr.length;
        for(int start=0;start<n;start++){
            for(int length=1;start+length<=n;length+=2){
                int end=start+length-1;
                for(int i=start;i<=end;i++)
                    sum+=arr[i];
            }

        }
        return sum;
    }
}
