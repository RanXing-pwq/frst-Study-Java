import java.util.Scanner;
public class StringDemo3 {
    public static void main(String[] args) {
        String str1 = "abc";

        Scanner sc = new Scanner(System.in);
        String str2 = sc.nextLine();
        boolean b1 = str2==str1;
        System.out.println(b1);
    }
}
