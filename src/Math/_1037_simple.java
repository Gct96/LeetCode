package Math;

/**
 * 给定一个数组points，其中points[i] = [xi, yi]表示 X-Y 平面上的一个点，如果这些点构成一个回旋镖则返回true。
 * 回旋镖定义为一组三个点，这些点各不相同且不在一条直线上
 * @author keyboardhero
 * @create 2022-06-03 13:30
 */
public class _1037_simple {
    public boolean isBoomerang(int[][] points) {//计算斜率
        return (points[0][0]-points[1][0])*(points[2][1]-points[1][1]) != (points[2][0]-points[1][0])*(points[0][1]-points[1][1]);
    }
}
