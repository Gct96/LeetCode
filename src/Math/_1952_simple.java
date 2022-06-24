package Math;

import org.junit.Test;

/**
 *给你一个整数 n 。如果 n 恰好有三个正除数 ，返回 true ；否则，返回 false 。
 * 如果存在整数 k ，满足 n = k * m ，那么整数 m 就是 n 的一个 除数 。
 * @author keyboardhero
 * @create 2022-06-24 9:56
 */
public class _1952_simple {
    public boolean isThree(int n) {
        double k=Math.sqrt(n);
        if((int)k!=k)
            return false;
        if(n==1)
            return false;
        for(int i=2;i<k;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    @Test
    public void test(){
        boolean three = isThree(16);
        System.out.println(three);
    }
}
