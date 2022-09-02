package String;

/**
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * @author KeyboardHero
 * @create 2022-07-15 10:46
 */
public class _344_simple {
    //双指针法
    public void reverseString(char[] s) {
        int length=s.length;
        int left=0;
        int right=length-1;
        while(left<right){
            swap(s,left++,right--);
        }
    }

    private void swap(char[] s,int i,int j){
        s[i]=(char)(s[i]+s[j]);
        s[j]=(char)(s[i]-s[j]);
        s[i]=(char)(s[i]-s[j]);
    }
}
