public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("666");
        int len=sb.length();
        String str=sb.toString();

        System.out.println(str.length());
        System.out.println(str);

    }
}
