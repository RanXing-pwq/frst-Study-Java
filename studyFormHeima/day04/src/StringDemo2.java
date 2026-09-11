public class StringDemo2 {
    public static void main(String[] args) {
        //直接比较
        String str1 = new String("RanXing886");
        String str2 = new String("RanXing886");
        boolean b1 = str1.equals(str2);
        System.out.println(b1);
        //不区分大小写
        String str3 = new String("ranxing886");
        boolean b2 = str3.equalsIgnoreCase(str2);
        System.out.println(b2);
    }
}
