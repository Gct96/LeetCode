package Math;

/**
 * 编写一个算法来判断一个数 n 是不是快乐数。
 * 「快乐数」定义为：
 * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
 * 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
 * 如果这个过程 结果为1，那么这个数就是快乐数。
 * 如果 n 是 快乐数 就返回 true ；不是，则返回 false
 * @author keyboardhero
 * @create 2022-05-07 17:16
 */
public class _202_simple {
    //求各位上的数字的平方和
    public int squareSum(int n){
        int sum=0;
        while(n>0){
            int digital=n%10;
            sum+=digital*digital;
            n/=10;
        }
        return sum;
    }

    public boolean isHappy(int n){
        //快慢针算法
        int slow=n,fast=squareSum(n);
        while(slow!=1&&slow!=fast){
            slow=squareSum(slow);
            fast=squareSum(squareSum(fast));
        }
        return slow==1;
    }

    /**
     *  * 编写一个算法来判断一个数 n 是不是快乐数。
     *  * 「快乐数」定义为：
     *  * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
     *  * 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
     *  * 如果这个过程 结果为1，那么这个数就是快乐数。
     *  * 如果 n 是 快乐数 就返回 true ；不是，则返回 false
     */
    public int squareSum_rev1(int n){
        int sum=0;
        while(n>0){
            int digital=n%10;
            sum+=digital*digital;
            n/=10;
        }
        return sum;
    }

    public boolean isHappy_rev1(int n){
        int slow=n,fast=squareSum_rev1(n);
        while(slow!=fast) {
            slow = squareSum_rev1(slow);
            fast = squareSum_rev1(squareSum_rev1(fast));
        }
        return slow==1;
    }
}
