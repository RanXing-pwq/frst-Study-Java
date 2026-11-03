/*2）设计一个课程类Course，包括：

课程编号cID、课程名cName、课程对象的数量cNum三个数据域；
一个无参构造方法，创建默认的课程，构造方法中输出“课程类无参构造方法”；
一个有参构造方法，创建指定课程编号cID、课程名cName的课程，构造方法中输出“课程类有参构造方法”；
所有数据域的访问器方法；
两个修改器方法，可以修改课程编号cID、课程名cName的值。*/

public class Course {
    private String cId;
    private String cName;
    private static int cNum;

    public Course(String cId, String cName) {
        System.out.println("课程类有参构造方法");
        cNum++;
        this.cId = cId;
        this.cName = cName;
    }

    public Course() {
        System.out.println("课程类无参构造方法");
        cNum++;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public static int getcNum() {
        return cNum;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

}
