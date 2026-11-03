/*
    将输入的金额"76876"转化为七位大写形式"零佰零拾柒万陆仟捌佰柒拾陆圆"
    1.把数字转化为大写：“76876”->“柒陆捌柒陆”
    2.补上零
    3.插入单位
*/

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String moneyStr = "";
        int count = 0;
        while (num != 0) {
            int temp = num % 10;
            moneyStr = getCaptialNumber(temp) + moneyStr;
            num /= 10;
            count++;
        }

        for (int i = 0; i < 7 - count; i++) {
            moneyStr = '零' + moneyStr;
        }
        String result = "";

        String[] danwei = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        for (int i = 0; i < 7; i++) {
            result += moneyStr.charAt(i) + danwei[i];
        }


        System.out.println(result);

    }

    public static String getCaptialNumber(int n) {
        //将数字转换为大写
        String[] capitalNumbers = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return capitalNumbers[n];
    }
}
