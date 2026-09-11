import java.util.Scanner;
public class TestGirlFriend {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend("linda",18);
        Scanner sc = new Scanner(System.in);
//        String name=sc.nextLine();
//        int age=sc.nextInt();
//        gf1.setName(name);
//        gf1.setAge(age);
        int ageOut=gf1.getAge();
        String nameOut =gf1.getName();
        System.out.println(nameOut);
        System.out.println(ageOut);
        gf1.playGame();
        gf1.call();
    }
}
