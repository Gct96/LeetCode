package Math;

/**
 * 平面上有n个点，点的位置用整数坐标表示 points[i] = [xi, yi] 。请你计算访问所有这些点需要的 最小时间（以秒为单位）。
 * 每一秒内，你可以：
 * 沿水平方向移动一个单位长度，或者
 * 沿竖直方向移动一个单位长度，或者
 * 跨过对角线移动 sqrt(2) 个单位长度（可以看作在一秒内向水平和竖直方向各移动一个单位长度）。
 * 必须按照数组中出现的顺序来访问这些点。
 * 在访问某个点时，可以经过该点后面出现的点，但经过的那些点不算作有效访问。
 * @author keyboardhero
 * @create 2022-06-10 15:35
 */
public class _1266_simple {
    //找俩个点之间纵坐标之差、横坐标之差的最大值之和
    public int minTimeToVisitAllPoints(int[][] points) {
        if(points.length==1)
            return 0;
        int minTime=0;
        for(int i=0;i<points.length-1;i++)
            minTime+=Math.max(Math.abs(points[i+1][1]-points[i][1]),Math.abs(points[i+1][0]-points[i][0]));
        return minTime;
    }
}
