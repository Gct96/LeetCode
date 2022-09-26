package String;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * 如果反转后整数超过 32 位的有符号整数的范围[−231, 231− 1] ，就返回 0。
 *
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *
 * @author KeyboardHero
 * @create 2022-07-15 11:26
 */
public class _7_middle {
    //从后取余，注意res 初始化 long型
    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            int t = x % 10;
            res = res * 10 + t;
            x /= 10;

        }
        return res == (int) res ? (int) res : 0;
    }
}
