package Math;

import org.junit.Test;

/**
 * 对于一个正整数，如果它和除了它自身以外的所有 正因子之和相等，我们称它为 「完美数」。
 * 给定一个整数n，如果是完美数，返回 true；否则返回 false。
 * @author keyboardhero
 * @create 2022-05-19 10:25
 */
public class _507_simple {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
                sum+=i;
        }
        if(sum==num)
            return true;
        else
            return false;
    }
    @Test
    public void test(){
        boolean b = checkPerfectNumber(2);
        System.out.println(b);
    }

    public boolean checkPerfectNumber_rev1(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
                sum+=i;
        }
        if(sum==num)
            return true;
        else
            return false;
    }
}
