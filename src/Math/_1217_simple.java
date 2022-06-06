package Math;

/**
 * 有n个筹码。第 i 个芯片的位置是position[i]。
 * 我们需要把所有筹码移到同一个位置。在一步中，我们可以将第 i 个芯片的位置从position[i]改变为:
 * position[i] + 2或position[i] - 2，此时cost = 0
 * position[i] + 1或position[i] - 1，此时cost = 1
 * 返回将所有筹码移动到同一位置上所需要的 最小代价 。
 * @author keyboardhero
 * @create 2022-06-06 11:22
 */
public class _1217_simple {
    //问题的本质是奇偶数变换求最小代价，故只需求出奇数偶数中的最小值
    public int minCostToMoveChips(int[] position) {
        int odd=0,even=0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2==0){
                even++;
            }
            else if(position[i]%2!=0){
                odd++;
            }
        }
        return Math.min(even,odd);
    }
}
