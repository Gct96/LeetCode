package Math;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 自除数是指可以被它包含的每一位数整除的数。
 * 例如，128 是一个 自除数 ，因为128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
 * 自除数 不允许包含 0 。
 * 给定两个整数left和right ，返回一个列表，列表的元素是范围[left, right]内所有的自除数
 * @author keyboardhero
 * @create 2022-05-21 15:36
 */
public class _728_simple {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList();
        while(left<=right){
            int tmp=left;
            while(tmp>0&&tmp%10!=0){
                if((left%(tmp%10))==0)
                    tmp/=10;
                else
                    break;
            }
            if(tmp==0)
                list.add(left);
            left++;
        }
        return list;
    }
    @Test
    public void test(){
        List<Integer> integers = selfDividingNumbers(1, 22);
        System.out.println(integers);
    }

    /**
     *  * 自除数是指可以被它包含的每一位数整除的数。
     *  * 例如，128 是一个 自除数 ，因为128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
     *  * 自除数 不允许包含 0 。
     *  * 给定两个整数left和right ，返回一个列表，列表的元素是范围[left, right]内所有的自除数
     */
    public List<Integer> selfDividingNumbers_rev1(int left, int right){
        List<Integer> list = new ArrayList();
        while(left<=right){
            int tmp=left;
            while(tmp>0&&tmp%10!=0){
                if((left%(tmp%10))==0)
                    tmp/=10;
                else
                    break;
            }
            if(tmp==0)
                list.add(left);
            left++;
        }
        return list;
    }
}
