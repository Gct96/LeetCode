package String;

/**
 * 请你来实现一个myAtoi(string s)函数，使其能将字符串转换成一个 32 位有符号整数（类似 C/C++ 中的 atoi 函数）。
 *
 * 函数myAtoi(string s) 的算法如下：
 *
 * 读入字符串并丢弃无用的前导空格
 * 检查下一个字符（假设还未到字符末尾）为正还是负号，读取该字符（如果有）。 确定最终结果是负数还是正数。 如果两者都不存在，则假定结果为正。
 * 读入下一个字符，直到到达下一个非数字字符或到达输入的结尾。字符串的其余部分将被忽略。
 * 将前面步骤读入的这些数字转换为整数（即，"123" -> 123， "0032" -> 32）。如果没有读入数字，则整数为 0 。必要时更改符号（从步骤 2 开始）。
 * 如果整数数超过 32 位有符号整数范围 [−231, 231− 1] ，需要截断这个整数，使其保持在这个范围内。具体来说，小于 −231 的整数应该被固定
 * 为 −231 ，大于 231− 1 的整数应该被固定为 231− 1 。
 * 返回整数作为最终结果。
 *
 * 注意：
 * 本题中的空白字符只包括空格字符 ' ' 。
 * 除前导空格或数字后的其余字符串外，请勿忽略 任何其他字符
 * @author KeyboardHero
 * @create 2022-07-16 17:54
 */
public class _8_middle {
    public int myAtoi(String s) {
        s=s.trim();//去掉前导空格
        if(s.length()==0)
            return 0;
        int index=0;//索引
        int digital=0;//数字
        int res=0;//最终结果
        int sign=1;//符号位
        //判断符号
        if(s.charAt(index)=='+'||s.charAt(index)=='-')
            sign=s.charAt(index++)=='+'?1:-1;
        //取数字
        for(;index<s.length();index++){
            digital=s.charAt(index)-'0';
            //非数字都要忽略
            if(digital<0||digital>9)
                break;
            //越界处理,res是上一循环的结果，判断它是否已大于最大值少一位或者将将要大于最大值
            if(res>Integer.MAX_VALUE/10||(res==Integer.MAX_VALUE/10 && digital>Integer.MAX_VALUE%10))
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            else
                res=res*10+digital;
        }
        //带上符号
        return sign*res;
    }
}
