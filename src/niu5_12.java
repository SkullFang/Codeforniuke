/**
 * Created by zhangyan on 2017/5/12.
 */
public class niu5_12 {
    public class Solution {
        public boolean Find(int target, int [][] array) {
            for(int i=0;i<array.length;i++){
                for(int j=0;j<array[i].length;j++)
                {
                    if(array[i][j]==target)
                        return true;
                }
            }
            return false;
        }
    }
}
