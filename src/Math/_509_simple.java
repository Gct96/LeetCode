package Math;

import org.junit.Test;

/**
 *
 * 斐波那契数（通常用F(n) 表示）形成的序列称为 斐波那契数列 。该数列由0和1开始，后面的每一项数字都是前面两项数字的和。也就是：
 * F(0) = 0，F(1)= 1
 * F(n) = F(n - 1) + F(n - 2)，其中 n > 1
 * 给定n ，请计算 F(n)
 *
 * @author keyboardhero
 * @create 2022-05-20 9:56
 */
public class _509_simple {
    public int fib(int n) {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
    @Test
    public void test(){
        System.out.println(fib(4));
    }
}
