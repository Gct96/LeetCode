package String;

import javax.xml.stream.events.Characters;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串
 * @author KeyboardHero
 * @create 2022-07-16 15:29
 */
public class _2406_simple {
    //双指针
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            //过滤非字母和数字字符
            while(left<right&& !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right&& !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            //转为小写后再判断是否相等
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
