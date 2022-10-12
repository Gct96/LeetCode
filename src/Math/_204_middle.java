package Math;

/**
 * 给定整数 n ，返回 所有小于非负整数 n 的质数的数量 。
 * @author keyboardhero
 * @create 2022-10-12 10:34
 */
public class _204_middle {
    //埃氏筛选法
    public int countPrimes(int n) {
        boolean[] arr = new boolean[n];
        int count=0;
        for(int i=2;i<n;i++){
            if(arr[i])
                continue;
            count++;
            for(int j=i;j<n;j+=i){
                arr[j]=true;
            }
        }
        return count;
    }
}
