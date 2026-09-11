import java.util.Scanner;
public class StringDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str1 = sc.next();
        int daXie=0;
        int xiaoXie=0;
        int shuZi=0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)>'A'&&str1.charAt(i)<'Z'){
                daXie++;
            } else if (str1.charAt(i)>'a'&&str1.charAt(i)<'z') {
                xiaoXie++;
            }else if (str1.charAt(i)>'0'&&str1.charAt(i)<'9') {
                shuZi++;
            }
        }
        System.out.printf("大写字母：%d\n小写字母：%d\n数字字符：%d\n",daXie,xiaoXie,shuZi);
    }
}
