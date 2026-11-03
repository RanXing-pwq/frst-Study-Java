import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println("---欢迎打开ranxing的学生管理系统---");
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        //list的初始化->拥有三个学生信息
        Student s1 = new Student("001","zhangsan",18);
        Student s2 = new Student("002","lisi",19);
        Student s3 = new Student("003","wangwu",20);
        list.add(s1);
        list.add(s2);
        list.add(s3);


        System.out.println("-1代表退出系统");
        System.out.println("0代表添加学生");
        System.out.println("1代表删除学生");
        System.out.println("2代表修改学生");
        System.out.println("3代表查看学生");
        System.out.println("4代表查看数组");

        while (true) {
            boolean run = true;
            System.out.println("请输入要执行的操作:");
            int num1 = sc.nextInt();
            switch (num1) {
                case -1:
                    System.exit(0);
                case 0:
                    creatStudent(list);
                    break;
                case 1:
                    deleteStudents(list);
                    break;
                case 2:
                    reviseStudent(list);
                    break;
                case 3:
                    showStudent(list);
                    break;
                case 4:
                    showStudents(list);
            }
        }


    }

    public static void creatStudent(ArrayList<Student> list) {
        //传入一个学生数组,将键盘录入的学生信息,添加到学生数组list当中

        System.out.println("请输入你要添加的学生信息:");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生name:");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println("请输入学生id:");
        String id = sc.nextLine();
        System.out.println(id);
        System.out.println("请输入学生age:");
        int age = sc.nextInt();
        System.out.println(age);
        Student s = new Student(id, name, age);
        boolean add = list.add(s);
        if (add) {
            System.out.println("添加成功!");
        } else {
            System.out.println("添加失败!");
        }
    }

    public static void deleteStudents(ArrayList<Student> list) {
        //删除对应学号学生
        Scanner sc = new Scanner(System.in);
        System.out.println("输入删除学生id:");
        String sid = sc.nextLine();
        boolean flag = false;
        showStudents(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(sid)) {
                list.remove(i);
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("删除成功!");
        } else {
            System.out.println("删除失败!");
        }
        showStudents(list);
    }

    public static void reviseStudent(ArrayList<Student> list) {
        //传入一个学生id,遍历学生列表list,修改对应学生信息

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改学生的id:");
        String sid = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getId().equals(sid)) {

                System.out.println(sid + "的原姓名和年龄");
                System.out.println(list.get(i).getName() + list.get(i).getAge());
                System.out.println("请输入修改后的name:");
                String name = sc.nextLine();
                list.get(i).setName(name);
                System.out.println("请输入修改后的age");
                int age = sc.nextInt();
                list.get(i).setAge(age);
                System.out.println("修改后的学生数组:");
                showStudents(list);
            }
        }
    }

    public static void showStudent(ArrayList<Student> list) {
        //查看学生
        Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();
        boolean flag = false;
        for (Student s : list) {
            if (s.getId().equals(sid)) {
                System.out.println(s.getName() + s.getAge());
            }
        }
    }

    public static void showStudents(ArrayList<Student> list) {
        //查看数组
        System.out.println("数组信息:");
        for (Student s : list) {
            System.out.println(s.getId() +","+ s.getName() + "," + s.getAge());
        }
    }
}
