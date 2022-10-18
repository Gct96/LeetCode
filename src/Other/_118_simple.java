package Other;

import java.util.ArrayList;
import java.util.List;

/**
 * @author keyboardhero
 * @create 2022-10-18 10:36
 */
public class _118_simple {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> col = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i)
                    col.add(1);
                else
                    col.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
            }
            res.add(col);
        }
        return res;
    }
}
