/**
 * Created by zhangyan on 2017/7/5.
 */

/*
操作给定的二叉树，将其变换为源二叉树的镜像
 */

public class niu_7_5_1 {
    public void Mirror(TreeNode root) {
        if(root!=null){
            TreeNode temp=null;
            temp=root.left;
            root.left=root.right;
            root.right=temp;
            Mirror(root.left);
            Mirror(root.right);
        }
    }
}
