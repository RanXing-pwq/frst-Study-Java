/*多个屏蔽词*/
public class StringDemo10 {
    public static void main(String[] args) {
        String talk = "woc,这tm,我真服了,是人类吗?sb暮蝶";
        String str[]={"woc","tm","sb"};
        for (int i = 0; i < str.length; i++) {
            talk = talk.replace(str[i],"***");
        }
        System.out.println(talk);
    }
}
