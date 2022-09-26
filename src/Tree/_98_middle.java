package Tree;

/**
 * 给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
 * 有效 二叉搜索树定义如下：
 * 节点的左子树只包含 小于 当前节点的数。
 * 节点的右子树只包含 大于 当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树
 *
 * @author keyboardhero
 * @create 2022-09-24 16:04
 */
public class _98_middle {
    //递归法
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean isValidBST(TreeNode root, long minVal, long maxVal){
        if(root==null)
            return true;
        //每个节点如果超过这个范围，则返回false
        if(root.val<=minVal||root.val>=maxVal)
            return false;
        return isValidBST(root.left,minVal,root.val) && isValidBST(root.right,root.val,maxVal);
    }

    //中序遍历递归法
    TreeNode prev;
    public boolean isValidBST2(TreeNode root){
        if(root==null)
            return true;
        //访问左子树
        if(!(isValidBST2(root.left)))
            return false;
        //访问当前节点，判断是否大于前节点
        if(prev!=null && root.val<= prev.val)
            return false;
        prev=root;
        //访问右子树
        if(!(isValidBST2(root.right)))
            return false;
        return true;
    }
}
