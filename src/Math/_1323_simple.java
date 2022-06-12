package Math;

import org.junit.Test;

/**
 * 给你一个仅由数字 6 和 9 组成的正整数 num。
 * 你最多只能翻转一位数字，将 6 变成 9，或者把 9 变成 6 。
 * 请返回你可以得到的最大数字。
 * @author keyboardhero
 * @create 2022-06-12 16:38
 */
public class _1323_simple {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        s=s.replaceFirst("6","9");
        return Integer.parseInt(s);
    }

    public int maximum69Number_2 (int num) {
        StringBuilder sb=new StringBuilder(Integer.toString(num));
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='6'){
                sb.setCharAt(i,'9');
                break;
            }
        }
        return Integer.parseInt(sb.toString());
    }

    @Test
    public void test(){
        int num=9969;
        int i = maximum69Number_2(num);
        System.out.println(i);
    }
}
