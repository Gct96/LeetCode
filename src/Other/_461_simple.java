package Other;

/**
 * 两个整数之间的 汉明距离 指的是这两个数字对应二进制位不同的位置的数目。
 * 给你两个整数 x 和 y，计算并返回它们之间的汉明距离。
 * @author keyboardhero
 * @create 2022-10-12 11:25
 */
public class _461_simple {
    //先做异或，再对异或的结果计数1的个数
    public int hammingDistance(int x, int y) {
        int xor=x^y,count=0;
        while(xor!=0){
            count+=xor&1;
            xor=xor>>>1;
        }
        return count;
    }
}
