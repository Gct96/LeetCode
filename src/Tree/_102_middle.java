package Tree;

import java.util.*;

/**
 * 给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。
 * @author keyboardhero
 * @create 2022-09-28 16:28
 */
public class _102_middle {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        //队列
        Queue<TreeNode> queue = new LinkedList<>();
        //列表
        List<List<Integer>> res = new ArrayList<>();
        queue.add(root);
        //队列不为空则循环
        while(!queue.isEmpty()){
            //每层节点的数量
            int size=queue.size();
            //新建列表存储每层的节点
            List<Integer> subList = new ArrayList<>();
            while(size-->0){
                TreeNode curr=queue.poll();
                subList.add(curr.val);
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
            //把每层的节点值存入到最终的结果列表中
            res.add(subList);
        }
        return res;
    }
}
