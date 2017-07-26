import java.util.ArrayList;

/**
 * Created by zhangyan on 2017/7/25.
 */
/*


 */
public class niu_7_23_bu {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        if(sum==0)
            return null;
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();


        for(int i=1;i<sum;i++){
            int s=0;
            for(int j=i;j<sum;j++){
                s+=j;
                if(s==sum){
                    ArrayList<Integer> log=new ArrayList<Integer>();
                    for(int k=i;k<=j;k++){
                        log.add(k);
                    }
                    res.add(log);
//                    System.out.println(log);
                    break;

                }else if(s>100){
                    break;
                }else{
                    continue;
                }
            }
        }
        return res;
    }
    public int Sum(int a,int b){
        int s=0;
        for(int i=1;i<=b;i++){
            s+=i;
        }
        return s;
    }

    public static void main(String[] args) {
        niu_7_23_bu ss=new niu_7_23_bu();
        ss.FindContinuousSequence(3);

    }
}
