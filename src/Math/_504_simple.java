package Math;

import org.junit.Test;

/**
 *给定一个整数 num，将其转化为 7 进制，并以字符串形式输出。
 * @author keyboardhero
 * @create 2022-05-19 9:59
 */
public class _504_simple {
    //注意负数的情况
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        boolean flag=num<0;
        if(num==0)
            return "0";
        if(flag)
            num=-num;
        while(num>0){
            sb.append(num%7);
            num/=7;
        }
        if(flag)
            sb.append("-");
        return sb.reverse().toString();
    }
    @Test
    public void test(){
        String s = convertToBase7(-7);
        System.out.println(s);
    }
}
