package Math;


import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * 给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。
 * 如果存在一个整数 x 使得n == 2x ，则认为 n 是 2 的幂次方。
 * @author keyboardhero
 * @create 2022-05-08 11:00
 */
public class _231_simple {
    //法一
    public  boolean isPowerOfTwo_1(int n) {
        if(n==1||n==2||n==4||n==8)
            return true;
        for(int i=4;i<=sqrt(n);i++){
            if(pow(2,i)==n)
                return true;
        }
        return false;
    }

    //法二
    public boolean isPowerOfTwo_2(int n){
        if(n==0) return false;
        while(n%2==0){
            n/=2;
        }
        return n==1;
    }
}
