package Math;

/**
 * 给你一个整数 columnNumber ，返回它在 Excel 表中相对应的列名称
 * 例如
 *  1 -> A
 *  2 -> B
 *  3 -> C
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 * @author keyboardhero
 * @create 2022-05-05 21:01
 */
public class _168_simple {
    public String convertToTitle(int columnNumber){
        StringBuilder sb = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            sb.append((char)(columnNumber%26+'A'));
            columnNumber/=26;
        }
        sb.reverse();
        return sb.toString();
    }

    public String convertToTitle_rev1(int columnNumber){
        StringBuilder sb=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            sb.append((char)(columnNumber%26+'A'));
            columnNumber/=26;
        }
        sb.reverse();
        return sb.toString();
    }
}
