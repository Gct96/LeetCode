package Array;

/**
 * 给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。
 *
 * 元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现不止一次
 *
 * @author keyboardhero
 * @create 2023-02-14 21:24
 */
public class _345_simple {
    public String reverseVowels(String s) {
        char[] array=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !isVowels(s.charAt(left))){
                left++;
            }
            while(left<right && !isVowels(s.charAt(right))){
                right--;
            }
            char temp=array[left];
            array[left]=array[right];
            array[right]=temp;
            left++;
            right--;
        }
        return new String(array);
    }

    boolean isVowels(char vow){
        vow=Character.toLowerCase(vow);
        if(vow=='a'||vow=='e'||vow=='i'||vow=='o'||vow=='u'){
            return  true;
        }
        else
            return false;
    }
}
