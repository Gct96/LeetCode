package Math;

import org.junit.Test;

/**
 * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 * @author keyboardhero
 * @create 2022-06-10 15:43
 */
public class _1281_simple {
    public int subtractProductAndSum(int n) {
        int sum=0,product=1;
        int p=0;
        while(n>0){
            p=n%10;
            sum+=p;
            product*=p;
            n/=10;
        }
        return product-sum;
    }

    @Test
    public void test(){
        int i = subtractProductAndSum(223);
        System.out.println(i);
    }
}
