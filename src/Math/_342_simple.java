package Math;

/**
 * 给定一个整数，写一个函数来判断它是否是 4 的幂次方。如果是，返回 true ；否则，返回 false 。
 * 整数 n 是 4 的幂次方需满足：存在整数 x 使得 n == 4x
 * @author keyboardhero
 * @create 2022-05-12 10:06
 */
public class _342_simple {
    public boolean isPowerOfFour(int n) {
        if(n==0)
            return false;
        while(n%4==0){
            n/=4;
        }
        return n==1;
    }
}
