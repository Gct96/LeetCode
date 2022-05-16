package Math;

/**
 * 给定两个字符串形式的非负整数num1 和num2，计算它们的和并同样以字符串形式返回。
 * 你不能使用任何內建的用于处理大整数的库（比如 BigInteger），也不能直接将输入的字符串转换为整数形式。
 * @author keyboardhero
 * @create 2022-05-16 9:43
 */
public class _415_simple {
    public String addStrings(String num1,String num2){
        StringBuilder res = new StringBuilder();
        int i=num1.length()-1,j=num2.length()-1,carry=0;
        while(i>=0||j>=0){
            int n1=i>0?num1.charAt(i)-'0':0;
            int n2=j>0?num2.charAt(j)-'0':0;
            int tmp=n1+n2+carry;
            carry=tmp/10;
            res.append(tmp%10);
            i--;j--;
        }
        if(carry==1) res.append(1);
        return res.reverse().toString();
    }
}
