/*

   根据前序和中序构造二叉树
 */

public class niu6_9{

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static class Solution {
        public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
            TreeNode root=Create(pre,0,pre.length-1,in,0,in.length-1);
            return root;

        }
        TreeNode Create(int [] pre,int leftpre,int rightpre,int [] in,int leftIn,int rightIn){
            if(leftpre>rightpre||leftIn>rightIn)
                return null;

                TreeNode p = new TreeNode(pre[leftpre]);
                int index = -1;
                for (int i = leftIn; i <= rightIn; i++) {
                    if (in[i] == pre[leftpre]) {
                        index = i;
                            p.left = Create(pre, leftpre + 1, leftpre+index-leftIn, in, leftIn, index - 1);  //注意递归 在前序中查找的为止
                            p.right = Create(pre, index-leftIn+leftpre+1, rightpre, in, index + 1, rightIn);
                        break;
                    }
                }

                return p;

        }
    }
    public  static void preSearch(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.val);
        if(root.left!=null)
        preSearch(root.left);
        if(root.right!=null)
        preSearch(root.right);
    }
    public static void main(String[] args) {
        int [] pre={1,2,4,7,3,5,6,8};
        int [] in={4,7,2,1,5,3,8,6};
        Solution su=new Solution();

        TreeNode tn=su.reConstructBinaryTree(pre,in);
        preSearch(tn);
    }
}