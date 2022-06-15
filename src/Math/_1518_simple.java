package Math;

import org.junit.Test;

/**
 * 小区便利店正在促销，用 numExchange 个空酒瓶可以兑换一瓶新酒。你购入了 numBottles 瓶酒。
 * 如果喝掉了酒瓶中的酒，那么酒瓶就会变成空的。
 * 请你计算 最多 能喝到多少瓶酒。
 * @author keyboardhero
 * @create 2022-06-15 19:57
 */
public class _1518_simple {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res=numBottles;
        int bottles=numBottles;
        while(bottles>=numExchange){
            res+=bottles/numExchange;
            bottles=(bottles/numExchange)+(bottles%numExchange);
        }
        return  res;
    }

    @Test
    public void test(){
        int i = numWaterBottles(9, 3);
        System.out.println(i);
    }
}
