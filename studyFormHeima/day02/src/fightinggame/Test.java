package fightinggame;


import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Role demo1 = new Role("鸠摩智",100,'男');
        Role demo2 = new Role("子峰",100,'女');
        demo1.showof();
        demo2.showof();


        System.out.println("游戏开始!");
        System.out.println("___________________");
        for(int i = 0; ;i++){
            if(i%2==0){
                demo1.hitted(demo2);
            }else{
                demo2.hitted(demo1);
            }
            if(demo1.getHealthPoints()<=0||demo2.getHealthPoints()<=0){
                System.out.println("___________________");
                System.out.println("游戏结束");
                break;
            }
        }


    }
}
