package Tree;

/**
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称
 * @author keyboardhero
 * @create 2022-09-26 15:10
 */
public class _101_simple {
    //对称二叉树：根节点的左右子树必须相等，同时，左子树的左子节点等于右子树的右子节点，左子树的右子节点等于右子树的左子节点
    //递归法
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return isSymmetric(root.left, root.right);
    }
    public boolean isSymmetric(TreeNode left,TreeNode right){
        if(left==null && right==null)
            return true;
        if(left==null || right==null || left.val!= right.val)
            return  false;
        return isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);
    }
}
