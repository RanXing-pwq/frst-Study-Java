import  java.util.Scanner;
public class PlanTickPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入购票月份：");
        int month = sc.nextInt();
        System.out.println("请输入机票原价：");
        double price = sc.nextDouble();
        System.out.println("请输入头等舱（0）或经济舱（1）：");
        byte eval = sc.nextByte();
        if (month>=5&&month<=10){
            price = fristPrice(month,price,eval);
        }else if(month>=1&&month<=4||month>=11&&month<=12){
            price = secondPrice(month,price,eval);
        }
        System.out.println("最后的票价为："+price);
    }
    //旺季
    public static double fristPrice (int month,double price,byte eval){
        if(eval==1){
            price *=0.85;
        }else{
            price *=0.9;
        }
        return price;
    }
    //淡季
    public static double secondPrice (int month,double price,byte eval){
        if(eval==1){
            price *=0.65;
        }else{
            price *=0.7;
        }
        return price;
    }

}
