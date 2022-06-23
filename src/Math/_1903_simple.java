package Math;

import org.junit.Test;

/**给你一个字符串 num ，表示一个大整数。请你在字符串 num 的所有非空子字符串
 * 中找出 值最大的奇数 ，并以字符串形式返回。如果不存在奇数，则返回一个空字符串 "" 。
 * @author keyboardhero
 * @create 2022-06-23 17:23
 */
public class _1903_simple {
    //贪心算法
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2!=0)
                return num.substring(0,i+1);
        }
        return "";
    }

    @Test
    public void test(){
        String s = largestOddNumber("4206");
        System.out.println(s.toString());
    }
}
