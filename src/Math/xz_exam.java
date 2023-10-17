package Math;

import java.util.Scanner;

/**
 * 第一行输入一个正整数n代表药品数量，接下去n行，每行两个正整数，分别代表药品的疼痛程度和功效值，第n+2行，输入一个正整数q代表询问
 * 次数，接下去q行，每行一个正整数x，代表询问的疼痛忍耐度，对于每一个询问，输出一行一个正整数代表在该疼痛忍耐度内，效果最好的药品
 * 的功效值是多少，如不存在，则输出-1
 * @author keyboardhero
 * @create 2023-10-17 15:23
 */
public class xz_exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入药品数量
        int n = scanner.nextInt();
        int[] painLevels = new int[n];
        int[] efficacies = new int[n];

        // 输入药品的疼痛程度和功效值
        for (int i = 0; i < n; i++) {
            painLevels[i] = scanner.nextInt();
            efficacies[i] = scanner.nextInt();
        }

        // 创建药品数组
        int[][] drugs = new int[n][2];

        // 填充药品数组
        for (int i = 0; i < n; i++) {
            drugs[i][0] = painLevels[i];
            drugs[i][1] = efficacies[i];
        }

        // 对药品按疼痛程度升序排序
        //Arrays.sort(drugs, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 0; i < n; i++) {
            System.out.println(drugs[i][0]+""+drugs[i][1]);
        }


        // 输入询问次数
        int q = scanner.nextInt();
        int[] num=new int[q];
        // 处理每次询问
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        // 使用二分查找找到疼痛忍耐度不大于x的最佳药品
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            int bestEfficacy = findBestEfficacy(drugs, num[i]);

            System.out.println(bestEfficacy);
        }
    }

    private static int findBestEfficacy(int[][] drugs,int x){
        int bestEfficacy=-1;
        for(int i=0;i<drugs.length;i++){
            if(drugs[i][0]<=x){
                bestEfficacy=Math.max(bestEfficacy,drugs[i][1]);
            }
        }
        return bestEfficacy;
    }

    // 二分查找找到疼痛忍耐度不大于x的最佳药品的功效值
//        private static int findBestEfficacy(int[][] drugs, int x) {
//            int left = 0;
//            int right = drugs.length - 1;
//            int bestEfficacy = -1;
//
//            while (left <= right) {
//                int mid = left + (right - left) / 2;
//                if (drugs[mid][0] <= x) {
//                    bestEfficacy = Math.max(bestEfficacy, drugs[mid][1]);
//                    left = mid + 1;
//                } else {
//                    right = mid - 1;
//                }
//            }
//
//            return bestEfficacy;
//        }

}
