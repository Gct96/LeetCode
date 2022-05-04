package Math;

import sun.security.util.Length;

/**
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M
 * 例如，罗马数字2写做II，即为两个并列的1，12写做XII，即为X+II。
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例
 * I可以放在V(5)和X(10)的左边，来表示4和9。
 * X可以放在L(50)和C(100)的左边，来表示40和90
 * C可以放在D(500)和(1000)的左边，来表示400和900。
 * 给定一个罗马数字，将其转换成整数。
 * @author keyboardhero
 * @create 2022-05-02 10:28
 */
public class _13_simple {
    /**
     * switch case建立字符-整型映射表，for循环遍历字符串，if判断左右
     * @param ch
     * @return
     */
    private int get(char ch){
        switch (ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }

    public int romanToInt(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int val=get(s.charAt(i));
            if(i+1<s.length()&&val<get(s.charAt(i+1)))
                 sum-=val;
            else
                 sum+=val;
        }
        return sum ;
    }

    /**
     *  * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M
     *  * 例如，罗马数字2写做II，即为两个并列的1，12写做XII，即为X+II。
     *  * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例
     *  * I可以放在V(5)和X(10)的左边，来表示4和9。
     *  * X可以放在L(50)和C(100)的左边，来表示40和90
     *  * C可以放在D(500)和(1000)的左边，来表示400和900。
     *  * 给定一个罗马数字，将其转换成整数。
     */
    private int get_rev1(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }

    public int romanToInt_rev1(String s){
        int sum=0;
        for(int i=0;i<s.length();i++) {
            int val = get(s.charAt(i));
            if(val<get(s.charAt(i+1))&&i+1<s.length())
                sum-=val;
            else
                sum+=val;
        }
        return sum;
    }
}
