package Math;

/**
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
}
