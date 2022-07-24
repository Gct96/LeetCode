package String;

/**
 *
 编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回空字符串 ""。
 * @author KeyboardHero
 * @create 2022-07-24 14:48
 */
public class _14_simple {
    //使用indexOf函数进行匹配
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0)
            return "";
        String pre=strs[0]; //默认第一个串是公共前缀
        int i=1;
        while(i<strs.length){
            while(strs[i].indexOf(pre)!=0)//公共前缀匹配的第一个位置一定是下标0
                pre=pre.substring(0,pre.length()-1); //不断缩小截取
            i++;
        }
        return pre;
    }
}
