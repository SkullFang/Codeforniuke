import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by zhangyan on 2017/7/4.
 */
/*
输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）

用层次遍历。
 */

class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }

public class niu_7_4_3 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result=false;
        if(root1 !=null && root2!=null) {
            LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
            TreeNode p = null;
            queue.offer(root1);
            while (!queue.isEmpty()) {
                p = queue.poll();
                 if(p.val==root2.val){
                     result=doesTree1HaveTree2(p,root2);
                 }
                if (p.left != null) {
                    queue.offer(p.left);
                }
                if (p.right != null) {
                    queue.offer(p.right);
                }
            }
        }

       return result;
    }
    public static boolean doesTree1HaveTree2(TreeNode node1,TreeNode node2){

    //如果Tree2已经遍历完了都能对应的上，返回true
        if (node2 == null) {
            return true;
        }
        //如果Tree2还没有遍历完，Tree1却遍历完了。返回false
        if (node1 == null) {
            return false;
        }
        //如果其中有一个点没有对应上，返回false
        if (node1.val != node2.val) {
            return false;
        }
//如果根节点对应的上，那么就分别去子节点里面匹配
        return doesTree1HaveTree2(node1.left,node2.left) && doesTree1HaveTree2(node1.right,node2.right);
    }

    public static void main(String[] args) {
        niu_7_4_3 ss=new niu_7_4_3();
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

        TreeNode b1=new TreeNode(2);
        TreeNode c1=new TreeNode(3);
        TreeNode d1=new TreeNode(4);
        b1.left=c1;
        b1.right=d1;
        c1.left=c1.right=d1.left=d1.right=null;
        ss.HasSubtree(a,b1);

//        System.out.print(ss.HasSubtree(a,b1));

//        ArrayList<Integer> result=new ArrayList<Integer>();
//        result=ss.levelSearch(a);
    }
}
