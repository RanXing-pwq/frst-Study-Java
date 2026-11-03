import java.util.ArrayList;

public class ArraryList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //增
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("Hello");
        list.add("World");
        System.out.println(list.add("TMD"));

        //删
        list.remove(2);
        list.remove("A");
        System.out.println(list.remove("B"));

        //改
        list.set(2,"sb");

        //查
        String s = list.get(1);
        System.out.println(s);

        int size = list.size();
        System.out.println(size);

        System.out.println(list);
        list.removeAll(list);
        System.out.println(list);
    }
}
