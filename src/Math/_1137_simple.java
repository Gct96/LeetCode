package Math;

import org.junit.Test;

/**
 * 泰波那契序列Tn定义如下：
 * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0的条件下 Tn+3 = Tn + Tn+1 + Tn+2
 * 给你整数n，请返回第 n 个泰波那契数Tn 的值。
 * @author keyboardhero
 * @create 2022-06-03 15:01
 */
public class _1137_simple {
    public int tribonacci(int n) {
        int p = 0, q = 1, r = 1,s=0;
        if(n==0)
            return 0;
        else if(n==1||n==2)
            return 1;
        else{
            for(int i=3;i<=n;i++) {
                s = p + q + r;
                p = q;
                q = r;
                r = s;
            }
        }
        return s;
    }

    @Test
    public void test(){
        int tribonacci = tribonacci(25);
        System.out.println(tribonacci);
    }
}
