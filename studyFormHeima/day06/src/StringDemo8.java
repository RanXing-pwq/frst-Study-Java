/*
    手机号屏蔽:将手机号中间四位变为"*";
 */
import java.util.Scanner;
public class StringDemo8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();
        String result="";
        String star = num.substring(0,3);
        String end = num.substring(num.length()-4,num.length());
        result=star+"****"+end;
        System.out.println(result);
    }
}
