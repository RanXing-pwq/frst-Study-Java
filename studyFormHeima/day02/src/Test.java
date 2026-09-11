public class Test {
    public static void main(String[] args) {
        OOPPhone p1 = new OOPPhone();
        OOPPhone p2 = new OOPPhone();
        p1.brand = "Samsung";
        p1.price = 1.99;
        p2.brand = "Xiaomi";
        p2.price = 10.98;
        p1.call();
        p2.call();
        p1.playGame();
        p2.playGame();
        System.out.println(p1.price);
        System.out.println(p2.price);
    }
}
