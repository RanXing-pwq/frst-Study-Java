import java.util.ArrayList;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        switch(type){
            case 1: test1(sc);break;
            case 2: test2(sc);break;
            case 3: test3(sc);break;
            case 4: test4(sc);
        }
    }
    //test方法为（4）中情况，见上述说明


    public static void test1(Scanner sc) {
        /*① 使用无参构造方法建立二个学生对象；
② 查看学生对象总数*/
        ArrayList<Student> stuList = new ArrayList<Student>();
        Student stu1 = new Student();
        Student stu2 = new Student();
        stuList.add(stu1);
        stuList.add(stu2);
        System.out.println("学生总数为："+ Student.getStuNum());
    }


    public static void test2(Scanner sc) {
        /*使用无参构造方法建立三门课程对象；
② 查看课程对象总数*/
        ArrayList<Course> cList = new ArrayList<Course>();
        Course c1 = new Course();
        Course c2 = new Course();
        Course c3 = new Course();
        cList.add(c1);
        cList.add(c2);
        cList.add(c3);
        System.out.println("课程总数为："+ Course.getcNum());
    }


    public static void test3(Scanner sc) {
        /*① 使用有参构造方法建立一个学生对象；
② 使用无参构造方法建立二门课程对象；
③ 使用学生选课类进行课程选择，为学生选择这两门课程
④ 查看学生选课总数
⑤ 查看学生选课详情*/

//        输入样例:
//        3
//        01 Tom
//        c01 数据结构
//        c02 软件工程
//        输出样例:
//        学生类有参构造方法
//        课程类无参构造方法
//        课程类无参构造方法
//        学生选课的总数为：2
//        学生选课情况如下：
//        01    Tom    c01    数据结构
//        01    Tom    c02    软件工程
        ArrayList<Student> stuList = new ArrayList<Student>();
        ArrayList<Course> cList = new ArrayList<Course>();
        //实现1,2
        String stuName = sc.next();
        String stuID = sc.nextLine();
        stuList.add(new Student(stuID,stuName));

        Course c1 = new Course();
        String cID1 = sc.next();
        String cName1 = sc.nextLine();
        c1.setcId(cID1);
        c1.setcName(cName1);
        cList.add(c1);
        System.out.println(cList.get(0).getcId()+c1.getcName());

        Course c2 = new Course();
        String cID2 = sc.next();
        System.out.println(cID2);
        String cName2 = sc.nextLine();
        System.out.println(cName2);
        c2.setcId(cID2);
        System.out.println(c2.getcId());
        c2.setcName(cName2);
        System.out.println(c2.getcName());
        cList.add(c2);
        System.out.println(cList.get(1).getcId()+c2.getcName());

        //3
        Schedule sh1 = new Schedule();
        sh1.addCourse(stuList.get(0),cList.get(0));
        sh1.addCourse(stuList.get(0),cList.get(1));
        System.out.println("学生选课的总数为："+sh1.getSchNum());
        sh1.displayCourse();
    }


    public static void test4(Scanner sc) {
/*① 使用有参构造方法建立三个学生对象；
② 使用有参构造方法建立四门课程；
③ 使用学生选课类进行课程选择
    第一个学生选择课程2、课程3；
    第二个学生选择课程1；
    第三个学生选择课程1、课程2、课程4。
④ 查看选课信息
    查看学生对象总数
    查看课程对象总数
    查看学生选课总数
    查看学生选课详情*/


    }
}

/*
// 学生类Student
class Student{

}

// 课程类Course
class Course{

}

// 学生选课类Schedule
class Schedule{

}*/
