package Math;

/**
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * @author keyboardhero
 * @create 2022-05-01 17:09
 */
public class _9_simple {
    /**
     * 将整数转为字符串解——String.valueOf()
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        if(x<0||x%10==0&&x!=0)
            return false;
        String s=String.valueOf(x);
        int m=s.length()-1;
        int n=0;
        while(m>n){
            if(s.charAt(m)!=s.charAt(n))
                return false;
            m--;
            n++;
        }
        return true;
    }
}
