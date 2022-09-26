package Tree;

import java.util.Deque;
import java.util.LinkedList;

/*给定一个二叉树，找出其最大深度。二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * @author keyboardhero
 * @create 2022-09-23 10:01
 */
//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class _104_simple {
    //法一：递归
    public int maxDepth(TreeNode root) {
        return root==null?0:Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
    //法二：BFS
    public int maxDepth2(TreeNode root){
        if(root==null)
            return 0;
        Deque<TreeNode> deque = new LinkedList<>();
        //深度计数
        int count=0;
        //进队
        deque.push(root);
        //队列非空则循环
        while(!deque.isEmpty()){
            //每层的节点个数
            int size=deque.size();
            while(size-->0){
                //每层节点逐一出队
                TreeNode curr=deque.pop();
                if(curr.left!=null){
                    deque.addLast(curr.left);
                }
                if(curr.right!=null){
                    deque.addLast(curr.right);
                }
            }
            //每层节点数都出完队时深度加一
            count++;
        }
        return count;
    }
}
