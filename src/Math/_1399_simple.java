package Math;

import org.junit.Test;

/**
 * 给你一个整数 n。请你先求出从 1到 n 的每个整数 10 进制表示下的数位和（每一位上的数字相加），然后把数位和相等的数字放到同一个组中。
 * 请你统计每个组中的数字数目，并返回数字数目并列最多的组有多少个。
 * @author keyboardhero
 * @create 2022-06-14 19:16
 */
public class _1399_simple {
    public int countLargestGroup(int n) {
        int[] count=new int[37];
        int maxNum=0,res=0;
        for(int i=1;i<=n;i++){
            int sum=getNumSum(i);
            count[sum]++;
            maxNum=Math.max(maxNum,count[sum]);
        }
        for(int i=36;i>0;i--){
            if(count[i]==maxNum)
                res++;
        }
        return res;
    }

    private int getNumSum(int i){
        int sum=0;
        while(i!=0){
            sum+=i%10;
            i/=10;
        }
        return sum;
    }

    @Test
    public void test(){
        int i = countLargestGroup(24);
        System.out.println(i);
    }
}
