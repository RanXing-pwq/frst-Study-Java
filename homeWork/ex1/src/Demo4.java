import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double p = 0.0;
        int sign = 1;
        double num = 0.0;
        for (int i = 1;; i += 2) {
            num = 1.0 / i;
            p += sign * num;
            sign = -sign;
            if (num < a) {
                break;
            }
        }
        double pi = 4.0 * p;
        System.out.println(pi);

    }
}