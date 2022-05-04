package Math;

/**
 * @author keyboardhero
 * @create 2022-05-04 15:32
 */
public class _70_simple {
    public int climbStairs(int n){
        int p=0,q=0,r=1; //f(0)=1 0级台阶1种方法
        for(int i=1;i<=n;i++){
            p=q;
            q=r;
            r=p+q;
        }
        return r;
    }
}
