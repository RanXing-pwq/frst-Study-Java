import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder(sc.nextLine());
        StringBuilder sb2 = new StringBuilder(sc.nextLine());
        boolean flag = false;
        for (int i = 0; i < sb1.length(); i++) {
            if(sb1.toString().equals(sb2.toString())){
                flag = true;
                break;
            }
            char c = sb1.charAt(0);
            sb1.deleteCharAt(0);
            sb1.append(c);
        }
        System.out.println(flag);
    }
}
