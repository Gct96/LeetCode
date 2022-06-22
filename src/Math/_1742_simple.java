package Math;

import org.junit.Test;

/**
 * 你在一家生产小球的玩具厂工作，有 n 个小球，编号从 lowLimit 开始，到 highLimit结束（包括 lowLimit和highLimit ，即
 * n == highLimit - lowLimit + 1）。另有无限数量的盒子，编号从 1 到 infinity 。
 * 你的工作是将每个小球放入盒子中，其中盒子的编号应当等于小球编号上每位数字的和。例如，编号 321 的小球应当放入
 * 编号 3 + 2 + 1 = 6 的盒子，而编号 10 的小球应当放入编号 1 + 0 = 1 的盒子。
 * 给你两个整数 lowLimit 和 highLimit ，返回放有最多小球的盒子中的小球数量。如果有多个盒子都满足放有最多小球，
 * 只需返回其中任一盒子的小球数量

 * @author keyboardhero
 * @create 2022-06-22 19:25
 */
public class _1742_simple {
    public int countBalls(int lowLimit, int highLimit) {
        int max=0;
        int[] count=new int[46];
        for(int i=lowLimit;i<=highLimit;i++){
            int index=sum(i);
            count[index]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]>max)
                max=count[i];
        }
        return max;
    }

    private int sum(int n){
        int total=0;
        while(n!=0){
            total+=n%10;
            n/=10;
        }
        return total;
    }

    @Test
    public void test(){
        int i = countBalls(19, 28);
        System.out.println(i);
    }
}
