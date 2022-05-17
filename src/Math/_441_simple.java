package Math;

/**
 * 你总共有n枚硬币，并计划将它们按阶梯状排列。对于一个由k行组成的阶梯，其第i行必须正好有 i枚硬币。阶梯的最后一行可能是不完整的。
 * 给你一个数字n ，计算并返回可形成 完整阶梯行的总行数。
 * @author keyboardhero
 * @create 2022-05-16 9:53
 */
public class _441_simple {
    public int arrangeCoins(int n) {
        int i=1;
        while(n>=i){
            n-=i;
            i++;
        }
        return i-1;
    }

    public int arrangeCoins_rev1(int n){
        int i=1;
        while(n>=i){
            n-=i;
            i++;
        }
        return i-1;
    }
}
