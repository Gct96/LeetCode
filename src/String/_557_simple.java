package String;

/**
 * 给定一个字符串 s ，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * 输入：s = "Let's take LeetCode contest"
 * 输出："s'teL ekat edoCteeL tsetnoc"
 * @author keyboardhero
 * @create 2023-02-20 19:10
 */
public class _557_simple {
    public String reverseWords(String s) {
        StringBuffer res = new StringBuffer();
        int right=0;
        int len=s.length();
        while(right<len){
            //确定单词的左右区间
            int left=right;
            while(right<len && s.charAt(right)!=' '){
                right++;
            }
            for(int index=left;index<right;index++){
                res.append(s.charAt(left-index+right-1)); //right-1是因为当前right在空格上，left-index分别是0 -1 -2...
            }
            while(right<len && s.charAt(right)==' '){
                right++;
                res.append(' ');
            }
        }
        return res.toString();
    }
}
