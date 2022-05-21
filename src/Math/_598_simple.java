package Math;

/**
 *
 * 给你一个 mxn 的矩阵M，初始化时所有的0和一个操作数组 op ，其中 ops[i] = [ai, bi] 意味着当所有的 0 <= x < ai 和 0 <= y < bi 时， M[x][y] 应该加 1。
 * 在执行完所有操作后，计算并返回矩阵中最大整数的个数。
 *
 * @author keyboardhero
 * @create 2022-05-20 10:36
 */
public class _598_simple {
    public int maxCount(int m, int n, int[][] ops) {
        for(int[] op:ops){
            m=Math.min(m,op[0]);
            n=Math.min(n,op[1]);
        }
        return m*n;
    }

    /**
     *  * 给你一个 mxn 的矩阵M，初始化时所有的0和一个操作数组 op ，其中 ops[i] = [ai, bi] 意味着当所有的 0 <= x < ai 和 0 <= y < bi 时， M[x][y] 应该加 1。
     *  * 在执行完所有操作后，计算并返回矩阵中最大整数的个数。
     *  *
     */
    public int maxCount_rev1(int m,int n,int[][] ops){
        for(int[] op:ops){
            m=Math.min(m,op[0]);
            n=Math.min(n,op[1]);
        }
        return m*n;
    }
}
