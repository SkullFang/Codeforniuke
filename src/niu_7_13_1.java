/**
 * Created by zhangyan on 2017/7/13.
 */
/*
在一个字符串(1<=字符串长度<=10000，全部由字母组成)
中找到第一个只出现一次的字符,并返回它的位置
 */
public class niu_7_13_1 {
    public int FirstNotRepeatingChar(String str) {
        if(str.length()==0){
            return -1;
        }
        int [][]book=new int[124][3];
        for(int i=0;i<book.length;i++){
            for(int j=0;j<3;j++){
                book[i][j]=0;
            }
        }
//        System.out.println(str.length());
        for(int i=0;i<str.length();i++){
            int index=str.charAt(i);
            book[index][0]=index;
            book[index][1]++;
            book[index][2]=i;
//            System.out.println("book[index][1]"+index+" "+book[index][1]);
//            System.out.println("book[index][1]"+index+" "+book[index][2]);
        }

        int i=0;
        for(;i<str.length();i++){
            int index=str.charAt(i);
//            System.out.println(index+" "+book[index][1]);
            if(book[index][1]==1){
                i=index;
                break;
            }
        }
        return book[i][2];
    }
    public static void main(String[] args) {
        niu_7_13_1 ss=new niu_7_13_1();
        System.out.println(ss.FirstNotRepeatingChar("google"));
    }
}
