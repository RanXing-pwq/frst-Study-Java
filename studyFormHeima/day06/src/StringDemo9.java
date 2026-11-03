/*设置屏蔽词*/
public class StringDemo9{
    public static void main(String[] args) {
        String talk = "TMD,这暮蝶真是瘤子!";
        String result = talk.replace("TMD","**");
        System.out.println(result);
    }
}
