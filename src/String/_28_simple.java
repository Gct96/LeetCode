package String;

/**
 * 实现strStr()函数。
 *
 * 给你两个字符串haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，
 * 则返回 -1
 *
 * @author KeyboardHero
 * @create 2022-07-24 10:35
 */
public class _28_simple {
    //KMP算法
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        int i = 0,j=0;
        int[] next=new int[needle.length()];
        getNext(needle,next);
        while(i<haystack.length()&&j<needle.length()){
            if (j == -1 ||haystack.charAt(i)==needle.charAt(j)){
                ++i;
                ++j;
            }
            else
                j=next[j];
            if(j==needle.length())
                return i-j;
        }
        return -1;
    }

    //计算模式串的next数组
    private void getNext(String s,int[] next){
        int j=-1;
        int i=0;
        next[0]=-1;
        while(i<s.length()-1){
            if(j==-1||s.charAt(i)==s.charAt(j)){
                ++i;
                ++j;
                next[i]=j;
            }
            else
                j=next[j];
        }
    }
}
