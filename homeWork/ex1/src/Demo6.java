public class Demo6 {
    public static void main(String[] args) {
        int num1 =1;
        int num2 =1;
        System.out.printf("%d ",num1);
        System.out.printf("%d ",num2);

        for (int i = 0; i < 38; i++) {
            int num3 = num1 + num2;
            System.out.printf("%d ", num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
