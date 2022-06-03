package Math;

import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 整数的数组形式 num是按照从左到右的顺序表示其数字的数组。
 * 例如，对于 num = 1321 ，数组形式是 [1,3,2,1] 。
 * 给定 num ，整数的 数组形式 ，和整数 k ，返回 整数 num + k 的 数组形式
 * @author keyboardhero
 * @create 2022-05-30 10:27
 */
public class _989_simple {
    /**  注意int或long会引发溢出问题
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList();
        int n = num.length;
        BigInteger sum = null;

        for (int i = 0; i < n; i++) {
            sum = sum * 10 + num[i];
        }
        newNum = sum + k;
        while (newNum != 0) {
            int p = (int) newNum % 10;
            list.add(p);
            newNum /= 10;
        }
        Collections.reverse(list);
        return list;
    }
     */
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<Integer>();
        int n = num.length;
        for (int i = n - 1; i >= 0; --i) {
            int sum = num[i] + k % 10;
            k /= 10;
            if (sum >= 10) {
                k++;   // 处理进位，加到 k 上去
                sum -= 10;
            }
            res.add(sum);
        }
        for (; k > 0; k /= 10) { //处理k的剩余位数
            res.add(k % 10);
        }
        Collections.reverse(res);
        return res;
    }


    /**
     *  * 整数的数组形式 num是按照从左到右的顺序表示其数字的数组。
     *  * 例如，对于 num = 1321 ，数组形式是 [1,3,2,1] 。
     *  * 给定 num ，整数的 数组形式 ，和整数 k ，返回 整数 num + k 的 数组形式
     */
    public List<Integer> addToArrayForm_rev1(int[] num, int k) {
        List<Integer> res=new ArrayList<>();
        int n=num.length;
        for(int i=n-1;i>=0;i--){
            int sum=num[i]+k%10;
            k/=10;
            if(sum>=10){
                k++;
                sum-=10;
            }
            res.add(sum);
        }
        //处理k的剩余位数
        for(;k>0;k/=10){
            res.add(k%10);
        }
        Collections.reverse(res);
        return res;
    }
}
