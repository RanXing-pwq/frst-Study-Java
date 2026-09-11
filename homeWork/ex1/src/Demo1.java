import java.util.Scanner;

import static java.lang.Math.pow;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数: ");
        int a = sc.nextInt();
        int sum = 0;
        sum += (int) pow(a / 100, 3);
        sum += pow(a / 10 % 10, 3);
        sum += pow(a % 10, 3);
        if (a == sum) {
            System.out.println(a+"是水仙花数");
        } else {
            System.out.println(a+"不是水仙花数");
        }
        sc.close();
    }
}