package String;

/**
 * 给定一个正整数 n ，输出外观数列的第 n 项。
 *
 * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。
 *
 * 你可以将其视作是由递归公式定义的数字字符串序列：
 * countAndSay(1) = "1"
 * countAndSay(n) 是对 countAndSay(n-1) 的描述，然后转换成另一个数字字符串。
 *
 * 前五项如下：
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 第一项是数字 1
 * 描述前一项，这个数是 1 即 “ 一 个 1 ”，记作 "11"
 * 描述前一项，这个数是 11 即 “ 二 个 1 ” ，记作 "21"
 * 描述前一项，这个数是 21 即 “ 一 个 2 + 一 个 1 ” ，记作 "1211"
 * 描述前一项，这个数是 1211 即 “ 一 个 1 + 一 个 2 + 二 个 1 ” ，记作 "111221"

 * @author KeyboardHero
 * @create 2022-07-24 13:10
 */
public class _38_middle {
    public String countAndSay(int n) {
        String res = "1";
        for (int i = 2; i <= n; ++i) {
            StringBuilder stringBuilder = new StringBuilder();
            int index = 0;
            while (index < res.length()) {
                int count = 1;
                // 统计当前字符的个数，和下一个比较是否相等
                while (index < res.length() - 1 && res.charAt(index) == res.charAt(index + 1)) {
                    count++;
                    index++;
                }
                // 把当前字符的个数和当前字符一起保存起来
                stringBuilder.append(count).append(res.charAt(index));
                // 统计下一个字符
                index++;
            }
            res = stringBuilder.toString();
        }
        return res;
    }
}
