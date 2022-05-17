package Math;

import java.util.Arrays;

/**
 * 给你一个长度为 n 的整数数组，每次操作将会使 n - 1 个元素增加 1 。返回让数组所有元素相等的最小操作次数
 * @author keyboardhero
 * @create 2022-05-17 9:47
 */
public class _453_simple {
    //n-1个元素+1转换为1个元素-1
    public int minMoves(int[] nums){
        int minNum= Arrays.stream(nums).min().getAsInt();
        int res=0;
        for(int num:nums){
            res+=num-minNum;
        }
        return res;
    }
}
