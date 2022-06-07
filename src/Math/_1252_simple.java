package Math;

/**
 * 给你一个 m x n 的矩阵，最开始的时候，每个单元格中的值都是 0。
 * 另有一个二维索引数组indices，indices[i] = [ri, ci] 指向矩阵中的某个位置，其中 ri 和 ci 分别表示指定的行和列（从 0 开始编号）。
 * 对 indices[i] 所指向的每个位置，应同时执行下述增量操作：
 * ri 行上的所有单元格，加 1 。
 * ci 列上的所有单元格，加 1 。
 * 给你 m、n 和 indices 。请你在执行完所有indices指定的增量操作后，返回矩阵中奇数值单元格的数目。
 * @author keyboardhero
 * @create 2022-06-07 11:29
 */
public class _1252_simple {
    public int oddCells(int m, int n, int[][] indices) {
        int res=0;
        int[] row=new int[n];
        int[] col=new int[m];

        for(int i=0;i<indices.length;i++){ //统计各行、各列出现的次数
            row[indices[i][0]]++;
            col[indices[i][1]]++;
        }
        for(int i=0;i< n;i++){   //计算行列之和
            for(int j=0;j<m;j++){
                if((row[i]+col[j])%2!=0)
                    res++;
            }
        }
        return res;
    }
}
