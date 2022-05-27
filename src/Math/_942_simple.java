package Math;

/**
 * 由范围 [0,n] 内所有整数组成的 n + 1 个整数的排列序列可以表示为长度为 n 的字符串 s ，其中:
 * 如果perm[i] < perm[i + 1]，那么s[i] == 'I'
 * 如果perm[i] > perm[i + 1]，那么 s[i] == 'D'
 * 给定一个字符串 s ，重构排列perm 并返回它。如果有多个有效排列 perm，则返回其中任何一个 。
 * @author keyboardhero
 * @create 2022-05-27 14:04
 */
public class _942_simple {
    public int[] diStringMatch(String s) {
        //贪心算法
        int n=s.length(),low=0,high=n;
        int[] perm=new int[n+1];
        for(int i=0;i<n;i++){
            perm[i]=s.charAt(i)=='I'?low++:high--;
        }
        perm[n]=low; //最后一个数，此时low=high
        return perm;
    }
}
