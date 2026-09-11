import java.util.Scanner;
public class ScannerTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        double result = sc.nextDouble();
        System.out.printf("%.1f",result);

    }
}
