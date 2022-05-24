package Math;

import org.junit.Test;

/**
 * 给你两个整数left和right,在闭区间 [left, right]范围内，统计并返回计算置位位数为质数的整数个数。
 * 计算置位位数就是二进制表示中 1 的个数。
 * 例如， 21的二进制表示10101有 3 个计算置位
 * @author keyboardhero
 * @create 2022-05-22 11:10
 */
public class _762_simple {
    public int countPrimeSetBits(int left, int right) {
        int ans=0;
        while(left<=right){
            int count=0;
            boolean flag=true;
            String s = Integer.toBinaryString(left);

            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(c=='1')
                    count++;
            }
            if(count==1)
                flag=false;
            for(int i=2;i<=Math.sqrt(count);i++){
                if(count%i==0){
                    flag=false;
                    break;
                }
            }
            if(flag)
                ans++;
            left++;
        }
        return ans;
    }

    @Test
    public void test(){
        int i = countPrimeSetBits(6, 10);
        System.out.println(i);
    }

    /**
     *  * 给你两个整数left和right,在闭区间 [left, right]范围内，统计并返回计算置位位数为质数的整数个数。
     *  * 计算置位位数就是二进制表示中 1 的个数。
     *  * 例如， 21的二进制表示10101有 3 个计算置位
     */
    public int countPrimeSetBits_rev1(int left, int right){
        int ans=0;
        while(left<=right){
            int count=0;
            boolean flag=true;
            String s = Integer.toBinaryString(left);
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1')
                    count++;
            }
            if(count==1)
                flag=false;
            for(int i=2;i<Math.sqrt(count);i++){
                if(count%i==0){
                    flag=false;
                    break;
                }
            }
            if(flag)
                ans++;
            left++;
        }
        return ans;
    }
}
