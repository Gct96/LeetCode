package Math;

/**
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 * 输入为 非空 字符串且只包含数字 1 和 0
 * @author keyboardhero
 * @create 2022-05-04 10:57
 */
public class _67_simple {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int ca = 0;//进位初始化为0
        for(int i = a.length() - 1, j = b.length() - 1;i >= 0 || j >= 0; i--, j--) { //从后往前遍历
            int sum = ca; //同位相加的和
            sum += i >= 0 ? a.charAt(i) - '0' : 0; //判断下标是否越界
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            ans.append(sum % 2); //串的尾部添加相加的结果，因此最终结果要翻转。
            ca = sum / 2;// 更新进位的值
        }
        ans.append(ca == 1 ? ca : ""); //首位的进位是否为1
        return ans.reverse().toString();
    }

    /**
     *  给你两个二进制字符串，返回它们的和（用二进制表示）。
     *  输入为 非空 字符串且只包含数字 1 和 0
     */
    public String addBinary_rev1(String a,String b){
        StringBuilder ans = new StringBuilder();
        int ca=0;
        for(int i=a.length()-1,j=b.length()-1;i>=0||j>=0;i--,j--){
            int sum=ca;
            sum+=i>=0?a.charAt(i)-'0':0;
            sum+=j>=0?b.charAt(j)-'0':0;
            ans.append(sum%2);
            ca=sum/2;
        }
        ans.append(ca==1?ca:"");
        return ans.reverse().toString();
    }
}
