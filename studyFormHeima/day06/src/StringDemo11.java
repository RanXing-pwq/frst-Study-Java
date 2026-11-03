/*
身份信息查看:
    输出个人信息
    出生年月日:**年*月*日
    性别:男/女
 */

import java.util.Scanner;

public class StringDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String year = id.substring(id.length() - 12, id.length() - 8);
        String month = id.substring(id.length() - 8, id.length() - 6);
        String day = id.substring(id.length() - 6, id.length() - 4);
        System.out.println("人物的信息为:");
        System.out.println("出生年月日:" + year + "年" + month + "月" + day + "日");
        char gender = id.charAt(16);
        if (gender % 2 == 0) {
            System.out.println("性别:女");
        } else {
            System.out.println("性别:男");
        }
    }
}
