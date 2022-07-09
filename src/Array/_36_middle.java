package Array;

/**
 * 请你判断一个9 x 9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
 *
 * 数字1-9在每一行只能出现一次。
 * 数字1-9在每一列只能出现一次。
 * 数字1-9在每一个以粗实线分隔的3x3宫内只能出现一次。（请参考示例图）
 *
 * 注意：
 * 一个有效的数独（部分已被填充）不一定是可解的。
 * 只需要根据以上规则，验证已经填入的数字是否有效即可。
 * 空白格用'.'表示

 * @author keyboardhero
 * @create 2022-07-09 10:16
 */
public class _36_middle {
    //用数组构建map
    public boolean isValidSudoku(char[][] board) {
        int length=board.length;
        int[][] line=new int[length][length];
        int[][] column=new int[length][length];
        int[][] cell=new int[length][length];
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(board[i][j]=='.')
                    continue;
                int num=board[i][j]-'0'-1;//将当前格子数字转成下标索引
                int k=i/3*3+j/3;
                if(line[i][num]!=0||column[j][num]!=0||cell[k][num]!=0)
                    return false;
                line[i][num]=column[j][num]=cell[k][num]=1; //将当前num的存在标志置 1
            }
        }
        return true;
    }
}
