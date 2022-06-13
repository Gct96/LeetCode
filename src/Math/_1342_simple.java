package Math;

import org.junit.Test;

/**
 * 给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
 * @author keyboardhero
 * @create 2022-06-13 10:13
 */
public class _1342_simple {
    public int numberOfSteps(int num) {
        int steps=0;
        while(num!=0){
            if(num%2==0){
                num/=2;
                steps++;
            }else{
                num--;
                steps++;
            }
        }
        return steps;
    }

    @Test
    public void test(){
        int i = numberOfSteps(0);
        System.out.println(i);
    }
}
