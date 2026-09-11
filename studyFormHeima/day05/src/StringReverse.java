public class StringReverse {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = reverseStr(str1);
        System.out.println(str2);
        int a = 1;
    }
    public static String reverseStr(String str) {
        String strTemp = "";
        for (int i = str.length()-1; i >= 0; i--) {
            strTemp += str.charAt(i);
        }
        return strTemp;
    }
}
