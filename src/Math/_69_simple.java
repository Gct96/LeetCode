package Math;

/**
 * 给你一个非负整数x，计算并返回x的算术平方根 。
 * 由于返回类型是整数，结果只保留整数部分小数部分将被舍去 。
 * 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
 * @author keyboardhero
 * @create 2022-05-04 11:25
 */
public class _69_simple {
    public int mySqrt(int x){
        if(x==0)
            return 0;
        int ans=(int) Math.exp(0.5*Math.log(x));
        return((ans+1)*(ans+1)<=x?ans+1:ans);//因误差原因需判断是否要将最终结果加一
    }
}
