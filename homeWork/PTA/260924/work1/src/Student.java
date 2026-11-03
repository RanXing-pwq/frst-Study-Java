/*1）设计一个学生类Student，包括：

学号stuID、姓名stuName、学生对象的数量stuNum三个数据域；
一个无参构造方法，创建默认的学生，构造方法中输出“学生类无参构造方法”；
一个有参构造方法，创建指定学号stuID、姓名stuName的学生，构造方法中输出“学生类有参构造方法”；
所有数据域的访问器方法；
两个修改器方法，可以修改学号stuID、姓名stuName的值。*/

public class Student {
    private String stuName;
    private String stuID;
    private static int stuNum;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public static int getStuNum() {
        return stuNum;
    }

    public Student( String stuID,String stuName) {
        System.out.println("学生类有参构造方法");
        stuNum++;
        this.stuName = stuName;
        this.stuID = stuID;
    }

    public Student() {
        System.out.println("学生类无参构造方法");
        stuNum++;
    }
}
