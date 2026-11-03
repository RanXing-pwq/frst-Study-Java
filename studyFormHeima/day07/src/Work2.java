/*
生成验证码

内容：可以是小写字母，也可以是大写字母，还可以是数字

长度为5

内容中是四位字母，1位数字。

其中数字只有1位，但是可以出现在任意的位置。
*/

import java.util.Random;

public class Work2 {
    public static void main(String[] args) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        char c;
        for (int i = 0; i < 4; i++) {


            boolean b = rand.nextBoolean();
            if (b) {
                c = (char) (rand.nextInt(26) + 'a');
            } else {
                c = (char) (rand.nextInt(26) + 'A');
            }
            sb.append(c);
        }
        int i = rand.nextInt(5);
        char c1 = (char) (rand.nextInt(10) + '0');
        sb.insert(i, c1);
        System.out.println(sb.toString());
    }
}
