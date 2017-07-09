import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by zhangyan on 2017/7/7.
 */
/*
从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class niu_7_7_1 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        if(root!=null){
            LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
            TreeNode p=null;
            queue.offer(root);
            while (!queue.isEmpty()){
                p=queue.poll();
                result.add(p.val);
                if(p.left!=null){
                    queue.offer(p.left);
                }
                if(p.right!=null){
                    queue.offer(p.right);
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(2);
        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(4);
        TreeNode e=new TreeNode(5);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        d.left=d.right=e.left=e.right=c.left=c.right=null;
        niu_7_7_1 ss=new niu_7_7_1();
        System.out.println(ss.PrintFromTopToBottom(a));
    }
}
