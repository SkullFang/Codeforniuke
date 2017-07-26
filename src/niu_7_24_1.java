/**
 * Created by zhangyan on 2017/7/25.
 */
/*
输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class niu_7_24_1 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null)
            return true;
        int left=depth(root.left);
        int right=depth(root.right);
        int diff=left-right;
        if(diff<-1 || diff>1)
            return false;
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);

    }
    public int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=depth(root.left);
        int right=depth(root.right);

        return left>right ? left+1:right+1;
    }
}
