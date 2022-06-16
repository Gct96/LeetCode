package Math;

/**
 * 给你两个非负整数 low 和 high 。请你返回 low 和 high 之间（包括二者）奇数的数目
 * @author keyboardhero
 * @create 2022-06-16 10:45
 */
public class _1523_simple {
    public int countOdds(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            if(i%2!=0)
                count++;
        }
        return count;
    }

    /**
     * 我们可以使用前缀和思想来解决这个问题，定义 pre(x)为区间 [0,x]中奇数的个数，很显然：
     * pre(x) = x+1/2 取下界
     * 故答案为 pre(high) - pre(low - 1)。
     */
    public int countOdds_2(int low, int high) {
        return pre(high) - pre(low - 1);
    }

    public int pre(int x) {
        return (x + 1) >> 1;
    }

}
