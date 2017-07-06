import java.util.ArrayList;

/**
 * Created by zhangyan on 2017/7/6.
 */
/*
输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
/*
设置上下，左右四个边界。一步一步维护这个边界。进行螺旋输出。
 */
public class niu_7_6_1 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer>result=new ArrayList<Integer>();
        int hang=matrix.length;
        int lie=matrix[0].length;
        int left=0;int right=lie-1;
        int shang=0;int xia=hang-1;
        int s=0;
        while (true){

            for(int j=left;j<=right;j++){
                int i=shang;
//                System.out.print(matrix[i][j]);
                result.add(matrix[i][j]);
                s++;
            }
            if(s==hang*lie)
                break;
            shang++;
            for(int i=shang;i<=xia;i++){
                int j=right;
//                System.out.print(matrix[i][j]);
                result.add(matrix[i][j]);
                s++;
            }
            if(s==hang*lie)
                break;
            right--;
            for(int j=right;j>=left;j--){
                int i=xia;
//                System.out.print(matrix[i][j]);
                result.add(matrix[i][j]);
                s++;
            }
            if(s==hang*lie)
                break;
            xia--;
            for(int i=xia;i>=shang;i--){
                int j=left;
//                System.out.print(matrix[i][j]);
                result.add(matrix[i][j]);
                s++;
            }
            if(s==hang*lie)
                break;
            left++;
        }

        return result;

    }

    public static void main(String[] args) {
        int [][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        System.out.print(matrix.length);
//        System.out.print(matrix[0].length);
        niu_7_6_1 ss=new niu_7_6_1();
        ArrayList<Integer> list=new ArrayList<Integer>();
        list=ss.printMatrix(matrix);
        System.out.print(list);
    }
}
