package Math;

/**
 * @author keyboardhero
 * @create 2022-05-07 17:16
 */
public class _202_simple {
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
        int slow=n,fast=squareSum(n);
        while(slow!=1&&slow!=fast){
            slow=squareSum(slow);
            fast=squareSum(squareSum(fast));
        }
        return slow==1;
    }
}
