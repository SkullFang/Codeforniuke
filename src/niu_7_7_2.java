/**
 * Created by zhangyan on 2017/7/7.
 */
/*
输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
后序遍历就看看 最后面那个数，前面是不是有一半是小于它，一半是大于它。
 */
public class niu_7_7_2 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        int size=sequence.length;
//        System.out.print(size);
        if(size==0)
            return false;
        while (true){
            size--;
            int i=0;
            if(size==0)
                break;
            else {

//                System.out.println("sequence[size]"+size+" "+sequence[size]);
                while (sequence[i]<sequence[size]){
//                    System.out.println(sequence[i]);
                    i++;
                }
//                System.out.println("<"+i);
                while (sequence[i]>sequence[size]){
//                    System.out.println(sequence[i]);
                    i++;
                }
//                System.out.println(">"+i);

            }
            if(i!=size)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int []sequence={1,2,3,4,5};
        niu_7_7_2 ss=new niu_7_7_2();
        System.out.print(ss.VerifySquenceOfBST(sequence));

    }
}
