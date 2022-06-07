package Math;

import org.junit.Test;

/**
 * 给定一个数组coordinates，其中coordinates[i] = [x, y]，[x, y]表示横坐标为 x、纵坐标为 y的点。请你来判断，这些点是否在该坐标
 * 系中属于同一条直线上
 * @create 2022-06-07 10:22
 */
public class _1232_simple {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==2)
            return true;
        for(int i=2;i<coordinates.length;i++){
            if((coordinates[1][1]-coordinates[0][1])*(coordinates[i][0]-coordinates[0][0])!=(coordinates[1][0]-coordinates[0][0])*(coordinates[i][1]-coordinates[0][1]))
                return false;
        }
        return true;
    }

    @Test
    public void test(){
        int[][] coordinates=new int[][]{{1,2},{2,3},{3,5}};
        boolean b = checkStraightLine(coordinates);
        System.out.println(b);
    }
}
