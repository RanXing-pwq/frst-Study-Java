public class StringDemo1 {
    public static void main(String[] args) {
        String str1 = "RanXing";
        String str2 = "886";
        System.out.println(str1 + str2);      // RanXing886

        String str3 = new String("RanXing8862");
        System.out.println(str3);             // RanXing8862

        String str4 = new String();
        str4 = "RanXing3";
        System.out.println(str4);             // RanXing3

        String str5 = new String("RanXing4");
        System.out.println(str5);             // RanXing4

        char[] arr1 = {'p', 'h', 't', '6', '6', '6'};
        String str6 = new String(arr1);
        System.out.println(str6);             // pht666

        byte[] arr2 = {97, 98, 99, 100};
        String str7 = new String(arr2);
        System.out.println(str7);             // abcd
    }
}