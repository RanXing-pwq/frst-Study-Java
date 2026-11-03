package arrarylist2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraryList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要添加学生的数量:");
        int n = sc.nextInt();

        ArrayList<Student> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("请输入学生的姓名和年龄:");
            String name = sc.next();
            sc.nextLine();
            int age = sc.nextInt();
            list.add(new Student(name,age));
        }
//        Student s1 = new Student("XingRan",18);
//        list.add(s1);
//        Student s2 = new Student("Xiaolin",17);
//        list.add(s2);
        for (Student s: list) {
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
