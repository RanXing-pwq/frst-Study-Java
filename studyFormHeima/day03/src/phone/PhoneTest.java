package phone;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone[] arr = new Phone[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Phone();
            System.out.printf("请输入第%d个手机的品牌:", i + 1);
            arr[i].setBrand(sc.next());
            System.out.printf("请输入第%d个手机的价格:", i + 1);
            arr[i].setPrice(sc.nextDouble());
            System.out.printf("请输入第%d个手机的颜色:", i + 1);
            arr[i].setColor(sc.next());
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("第%d个手机\n", i + 1);
            arr[i].showOfIn();
        }

        double avg=averagePrice(arr);
        System.out.printf("%.2f",avg);

    }

    //计算平均价格
    public static double averagePrice(Phone arr[]) {
        double sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j].getPrice();
        }
        return sum / arr.length;
    }
}
