/*键盘输入任意字符串，打乱里面的内容

### 训练目标

随机数类Random相关API、字符串相关API*/

import java.util.Random;
import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        Random rand = new Random();
        for (int i = 0; i < str.length(); i++) {
            char temp = arr[i];
            int n = rand.nextInt(str.length());
            arr[i] = arr[n];
            arr[n] = temp;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(arr[i]);
        }
        String string = sb.toString();
        System.out.println(string);
    }
}
