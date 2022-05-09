package Math;

/**
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果
 * @author keyboardhero
 * @create 2022-05-09 10:51
 */
public class _258_simple {
    public int addDigits(int num) {
        while(num>=0&&num/10!=0){
            num=Sum(num);
        }
        return num;
    }

    public int Sum(int num){
        int sum=0;
        while(num>0){
            int digits=num%10;
            sum+=digits;
            num/=10;
        }
        return sum;
    }
}
