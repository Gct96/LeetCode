package String;

import java.util.Arrays;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 注意：若s 和 t中每个字符出现的次数都相同，则称s 和 t互为字母异位词。
 *
 * @author KeyboardHero
 * @create 2022-07-16 10:46
 */
public class _2562_simple {
    //先排序再比较
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars,tChars);
    }

    //设置临时数组统计次数，字符对应下标
    public boolean isAnagram2(String s, String t){
        //长度一致作前置约束，方便后续判断次数直接return
        if(s.length()!=t.length())
            return false;
        char[] letterCount=new char[26];
        for(int i=0;i<s.length();i++){
            letterCount[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            //判断当前字符是否0次，未出现过
            if(letterCount[t.charAt(i)-'a']==0){
                return false;
            }
            letterCount[t.charAt(i)-'a']--;
        }
        return true;
    }
}
