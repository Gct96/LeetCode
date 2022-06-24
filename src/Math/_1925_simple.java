package Math;

import org.junit.Test;

/**
 * 一个 平方和三元组(a,b,c)指的是满足 a2 + b2 = c2的 整数三元组a，b和c。
 * 给你一个整数n，请你返回满足1 <= a, b, c <= n的平方和三元组的数目。
 * @author keyboardhero
 * @create 2022-06-24 9:32
 */
public class _1925_simple {
    public int countTriples(int n) {
        int cnt=0;
        for(int i=1;i<=n-1;i++){
            for(int j=i+1;j<=n;j++){
                double k=Math.sqrt(i*i+j*j);
                if((int)k==k&&k<=n)
                    cnt+=2;
            }
        }
        return cnt;
    }

    @Test
    public void test(){
        int i = countTriples(10);
        System.out.println(i);
    }
}
