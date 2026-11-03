/*对称字符串 */
import java.util.Scanner;
public class StringBuilder2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        sb.append(str);
        sb.reverse();
        String str2=sb.toString();
        if(str.equals(str2)){
            System.out.println("当前字符串是对称字符串");
        }else{
            System.out.println("当前字符串不是对称字符串");
        }
    }
}
