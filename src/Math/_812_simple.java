package Math;

/**
 * 给定包含多个点的集合，从其中取三个点组成三角形，返回能组成的最大三角形的面积。
 * @author keyboardhero
 * @create 2022-05-23 9:59
 */
public class _812_simple {
    public double largestTriangleArea(int[][] points) {
        int N = points.length;
        double res = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int[] point1 = points[i];
                    int[] point2 = points[j];
                    int[] point3 = points[k];
                    int x1 = point1[0], y1 = point1[1];
                    int x2 = point2[0], y2 = point2[1];
                    int x3 = point3[0], y3 = point3[1];
                    res = Math.max(res, 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)));
                }
            }
        }
        return res;
    }

    /**
     * * 给定包含多个点的集合，从其中取三个点组成三角形，返回能组成的最大三角形的面积。
     * @param points
     * @return
     */
    public double largestTriangleArea_rev1(int[][] points) {
        int n=points.length;
        double ans=0;
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-1;j++){
                for(int k=0;k<n;k++){
                    int[] point1=points[i];
                    int[] point2=points[j];
                    int[] point3=points[k];
                    int x1=point1[0],y1=point1[1];
                    int x2=point1[0],y2=point1[1];
                    int x3=point1[0],y3=point1[1];
                    ans=Math.max(ans,0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)));
                }
            }
        }
        return ans;
    }
}
