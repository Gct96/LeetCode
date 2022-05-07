package Math;

/**
 * 给你一个字符串 columnTitle表示Excel表格中的列名称。返回该列名称对应的列序号。
 * A -> 1
 * B -> 2
 * C -> 3
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * @author keyboardhero
 * @create 2022-05-06 20:47
 */
public class _171_simple {
    public int titleToNumber(String columnTitle){
        int ans=0;
        for(int i=0;i<columnTitle.length();i++){
            int num=columnTitle.charAt(i)-'A'+1;
            ans=ans*26+num;
        }
        return ans;
    }

    public int titleToNumber_rev1(String columnTitle){
        int ans=0;
        for(int i=0;i<columnTitle.length();i++){
            int num=columnTitle.charAt(i)-'A'+1;
            ans=ans*26+num;
        }
        return ans;
    }
}
