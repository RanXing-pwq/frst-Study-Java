package demo1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(18);
        s.setName("lihua");
        regiest(s);

        Teacher t = new Teacher();
        t.setAge(31);
        t.setName("Wangjianguo");
        regiest(t);

        Administrator ad = new Administrator();
        ad.setAge(35);
        ad.setName("ranxing");
        regiest(ad);

    }
    public static void regiest(Person p){
        p.show();
    }
}
