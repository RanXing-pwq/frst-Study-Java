import java.util.Scanner;

import static java.lang.Math.abs;

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入a之值:");
        double a = sc.nextDouble();
        double result = iteration(a);
        System.out.println(a+"的平方根为"+result);
    }

    public static double iteration(double a) {
        double x0 = a / 2.0;
        double x1 = (x0 + a / x0) / 2.0;
        while (abs(x1 - x0) >= 1.0e-5) {
            double temp = x1;
            x0 = x1;
            x1 = (x0 + a / x0) / 2.0;
        }
        return x1;
    }
}
