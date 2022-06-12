package Math;

/**
 * 「无零整数」是十进制表示中不含任何 0的正整数。
 * 给你一个整数n，请你返回一个由两个整数组成的列表 [A, B]，满足：
 * A 和 B都是无零整数
 * A + B = n
 * 题目数据保证至少有一个有效的解决方案。
 * 如果存在多个有效解决方案，你可以返回其中任意一个
 * @author keyboardhero
 * @create 2022-06-12 15:23
 */
public class _1317_simple {
    public int[] getNoZeroIntegers(int n) {
        int[] res=new int[2];
        for(int i=1;i<n;i++){
            if(isNoZero(i)&&isNoZero(n-i)){
                res[0]=i;
                res[1]=n-i;
            }
        }
        return res;
    }

    private boolean isNoZero(int n){
        while(n!=0){
            if(n%10==0)
                return false;
            else
                n/=10;
        }
        return true;
    }
}
