package String;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1
 * @author KeyboardHero
 * @create 2022-07-16 10:31
 */
public class _1743_simple {
    //使用HashMap
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for(char ch:chars){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(chars[i])==1)
                return i;
        }
        return -1;
    }
}
