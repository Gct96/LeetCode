package Math;

/**
 * 反转 一个整数意味着倒置它的所有位。
 * 例如，反转 2021 得到 1202 。反转 12300 得到 321 ，不保留前导零 。
 * 给你一个整数 num ，反转 num 得到 reversed1 ，接着反转 reversed1 得到 reversed2 。如果 reversed2 等于 num ，返回 true ；
 * 否则，返回 false 。
 * @author keyboardhero
 * @create 2022-06-29 20:24
 */
public class _2119_simple {
    public boolean isSameAfterReversals(int num) {
        int i=num%10;
        if(num==0||i!=0)
            return true;
        else
            return false;
    }
}
