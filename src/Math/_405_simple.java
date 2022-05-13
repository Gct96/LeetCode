package Math;

/**
 * 给定一个整数，编写一个算法将这个数转换为十六进制数。对于负整数，我们通常使用补码运算方法。
 * 注意:
 * 十六进制中所有字母(a-f)都必须是小写。
 * 十六进制字符串中不能包含多余的前导零。如果要转化的数为0，那么以单个字符'0'来表示；对于其他情况，十六进制字符串中的第一个字符将不会是0字符。
 * 给定的数确保在32位有符号整数范围内。
 * 不能使用任何由库提供的将数字直接转换或格式化为十六进制的方法.
 * @author keyboardhero
 * @create 2022-05-13 11:00
 */
public class _405_simple {
    public String toHex(int num) {
        if (num == 0)
            return "0";
        StringBuilder sb = new StringBuilder();
        char c;
        while (num != 0) {
            int u = num & 15;           //将最低位的4位保留
            if (u >= 10)                //将这二进制的4位转为十六进制
                c = (char)(u - 10 + 'a');
            else
                c = (char)(u + '0');
            sb.append(c);
            num >>>= 4;  //继续下一个低位4位的转换
        }
        return sb.reverse().toString();
    }
}
