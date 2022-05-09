package Math;

/**
 * 丑数 就是只包含质因数 2、3 和 5 的正整数。
 * 给你一个整数 n ，请你判断 n 是否为 丑数 。如果是，返回 true ；否则，返回 false 。
 * @author keyboardhero
 * @create 2022-05-09 10:58
 */
public class _263_simple {
    //丑数=2**a+3**b+5**c，故反复除以2，3，5直至结果是否为1
    public boolean isUgly(int n){
        if(n<=0)
            return false;
        int[] factors={2,3,5};
        for(int factor:factors){
            while(n%factor==0){
                n/=factor;
            }
        }
        return n==1;
    }
}
