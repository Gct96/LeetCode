package Math;

import org.junit.Test;

/**
 * Hercy想要为购买第一辆车存钱。他每天都往力扣银行里存钱。
 * 最开始，他在周一的时候存入 1块钱。从周二到周日，他每天都比前一天多存入 1块钱。在接下来每一个周一，他都会比 前一个周一多存入 1块钱。
 * 给你n,请你返回在第 n天结束的时候他在力扣银行总共存了多少块钱。
 * @author keyboardhero
 * @create 2022-06-17 15:49
 */
public class _1716_simple {
    public int totalMoney(int n) {
        int count=0,sum=0,flag=1;
        while(count<n) {
            for (int i = flag;count<n;i++){
                count++;
                sum += i;
                if(count%7==0)
                    break;
            }
            flag++;
        }
        return sum;
    }

    @Test
    public void test(){
        int i = totalMoney(10);
        System.out.println(i);
    }
}
