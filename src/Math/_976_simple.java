package Math;

import java.util.Arrays;

/**
 * 给定由一些正数（代表长度）组成的数组 nums ，返回 由其中三个长度组成的、面积不为零的三角形的最大周长 。如果不能形成任何面积不为
 * 零的三角形，返回 0。
 * @author keyboardhero
 * @create 2022-05-27 15:02
 */
public class _976_simple {
    //排序+贪心
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for(int i=A.length-1;i>=2;i--){
            if(A[i-2]+A[i-1]>A[i]){
                return A[i-2]+A[i-1]+A[i];
            }
        }
        return 0;
    }
}
