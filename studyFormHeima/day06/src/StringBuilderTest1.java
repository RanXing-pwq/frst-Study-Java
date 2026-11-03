public class StringBuilderTest1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("abc");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("abcdefghijklmnopqrstuvwxyzabc");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
