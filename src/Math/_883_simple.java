package Math;

/**
 * 在n x n的网格grid中，我们放置了一些与 x，y，z 三轴对齐的1 x 1 x 1立方体。
 * 每个值v = grid[i][j]表示 v个正方体叠放在单元格(i, j)上。
 * 现在，我们查看这些立方体在 xy、yz和 zx平面上的投影。
 * 投影就像影子，将 三维 形体映射到一个 二维 平面上。从顶部、前面和侧面看立方体时，我们会看到“影子”。
 * 返回 所有三个投影的总面积
 * @author keyboardhero
 * @create 2022-05-24 15:07
 */
public class _883_simple {
    public int projectionArea(int[][] grid) {
        int n=grid.length;
        int xyArea=0,xzArea=0,yzArea=0;
        for(int i=0;i<n;i++){
            int xzHeight=0,yzHeight=0;
            for(int j=0;j<n;j++){
                xyArea+=grid[i][j]>0?1:0;
                xzHeight=Math.max(xzHeight,grid[j][i]);
                yzHeight=Math.max(yzHeight,grid[i][j]);
            }
            xzArea+=xzHeight;
            yzArea+=yzHeight;
        }
        return xyArea+xzArea+yzArea;
    }
    /**
     *  * 在n x n的网格grid中，我们放置了一些与 x，y，z 三轴对齐的1 x 1 x 1立方体。
     *  * 每个值v = grid[i][j]表示 v个正方体叠放在单元格(i, j)上。
     *  * 现在我们查看这些立方体在 xy、yz和 zx平面上的投影。
     *  * 投影就像影子，将三维形体映射到一个二维平面上。从顶部、前面和侧面看立方体时，我们会看到“影子”。
     *  * 返回所有三个投影的总面积
     */
    public int projectionArea_rev1(int[][] grid){
        int n=grid.length;
        int xyArea=0,xzArea=0,yzArea=0;
        for(int i=0;i<n;i++){
            int xzHeight=0,yzHeight=0;
            for(int j=0;j<n;j++){
                xyArea+=grid[i][j]>0?1:0;
                xzHeight=Math.max(xzHeight,grid[j][i]);
                yzHeight=Math.max(yzHeight,grid[i][j]);
            }
            xzArea+=xzHeight;
            yzArea+=yzHeight;
        }
        return xyArea+xzArea+yzArea;
    }
}
