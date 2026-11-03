package a01staticDemo1;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setAge(18);
        s1.setName("zhangsan");
        Student.teacherName = "ranxing";
        s2.setAge(18);
        s2.setName("zhangsan");
        show(s1);
        show(s2);

    }

    public static void show(Student s) {
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.teacherName);
    }
}
