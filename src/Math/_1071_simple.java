package Math;

import org.junit.Test;

/**
 * 对于字符串 s 和 t，只有在s = t + ... + t（t 自身连接 1 次或多次）时，我们才认定“t 能除尽 s”。
 * 给定两个字符串str1和str2。返回最长字符串x，要求满足 X 能除尽 str1 且 X 能除尽 str2 。
 * @author keyboardhero
 * @create 2022-06-03 13:33
 */
public class _1071_simple {
    public String gcdOfStrings(String str1, String str2) {
        String s1=str1+str2;
        String s2=str2+str1;
        if(!s1.equals(s2))
            return "";
        else
            return str1.substring(0,gcd(str1.length(),str2.length()));
    }

    public int gcd(int x, int y) {  //辗转相除法求最大公约数
        return x == 0 ? y : gcd(y % x, x);
    }

    @Test
    public void test(){
        String str1="ABABAB";
        String str2="ABAB";
        String s = gcdOfStrings(str1, str2);
        System.out.println(s);

    }
}
