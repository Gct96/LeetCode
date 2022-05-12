package Math;

import org.junit.Test;

import static java.lang.Math.sqrt;

/**给定一个 正整数 num ，编写一个函数，如果 num 是一个完全平方数，则返回 true ，否则返回 false 。
 进阶：不要 使用任何内置的库函数，如 sqrt 。
 * @author keyboardhero
 * @create 2022-05-12 10:28
 */
public class _367_simple {
    //二分法
    public boolean isPerfectSquare1(int num) {
        int left = 1, right = num;
        while(left <= right){
            int mid = (left + right) / 2;
            if(num / mid == mid && num % mid == 0)return true; //能整除并且整除结果是除数
            if(num / mid > mid || (num / mid == mid && num % mid > 0))
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }

    //内置函数法
    public boolean isPerfectSquare2(int num){
        int x=(int)sqrt(num);
        return x*x==num;
    }
    @Test
    public void testisPerfectSquare2(){
        System.out.println(isPerfectSquare2(1));
    }

    //暴力法
    public boolean isPerfectSquare3(int num) {
        int x=1,square=1;
        while(square<=num){
            if(square==num)
                return true;
            x++;
            square=x*x;
        }
        return false;
    }
}
