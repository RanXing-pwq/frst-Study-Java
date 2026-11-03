/*（3）设计一个学生选课类Schedule，包括：

学生列表stuList、课程列表cList、学生选课总数schNum三个数据域，两个列表的默认长度任意设定；
一个无参构造方法，创建默认的学生选课对象；
一个学生选课方法 addCourse(Student stu，Course course)，实现学生stu选择课程course操作；
一个显示学生选课详情方法 displayCourse()，显示所有学生选课情况。*/

import java.util.ArrayList;

public class Schedule {
    private  static ArrayList<Student> students;
    private  ArrayList<Course> courses ;
    private int schNum;

    public Schedule() {
    }

    public void addCourse(Student stu, Course course) {
        boolean addFlag = true;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStuID().equals(stu.getStuID())) {
                addFlag = false;
                break;
            }
        }
        if (addFlag) {
            students.add(stu);
        }
        courses.add(course);
        schNum++;

    }

    public int getSchNum() {
        return schNum;
    }

    public void displayCourse() {
        //打印信息例如:
        //01    Tom    c01    数据结构
        System.out.println("学生选课情况如下：");
        for (int i = 0; i < courses.size(); i++) {
            System.out.printf("%s\t%s\t%s\t%s\t",students.get(-1).getStuID(),students.get(-1).getStuName(),
                    courses.get(i).getcId(),courses.get(i).getcName());
        }
    }

}
