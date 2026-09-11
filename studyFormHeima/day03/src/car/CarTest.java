package car;

import java.util.Scanner;

public class CarTest {
        public static void main(String[] args) {
            Car[] cars = new Car[3];
            Scanner sc = new Scanner(System.in);
            for(int i = 0; i < cars.length; i++){
                cars[i] = new Car();
                System.out.printf("请输入汽车品牌:");
                cars[i].setBrand(sc.nextLine());
                System.out.printf("请输入汽车价格:");
                cars[i].setPrice(sc.nextDouble());
                sc.nextLine();
                System.out.printf("请输入汽车颜色:");
                cars[i].setColor(sc.nextLine());
            }
            for(int i = 0; i < cars.length; i++){
                cars[i].showOfIn();
            }
        }
}
