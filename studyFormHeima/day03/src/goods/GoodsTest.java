package goods;

import java.util.Scanner;

public class GoodsTest {
    public static void main(String[] args) {

        Goods arr[] = new Goods[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("现在开始入库");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Goods();
            System.out.printf("请依次输入商品的id,名字,价格,库存:");
            int id = sc.nextInt();
            sc.nextLine();
            arr[i].setId(id);
            String name = sc.nextLine();
            arr[i].setName(name);
            double price = sc.nextDouble();
            arr[i].setPrice(price);
            int count = sc.nextInt();
            arr[i].setCount(count);
            sc.nextLine();
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i].showOfIn();
        }
    }

}
