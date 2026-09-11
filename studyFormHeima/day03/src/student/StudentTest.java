package student;

//定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
//
//        学生的属性：学号，姓名，年龄。
//
//        要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
//
//        要求2：添加完毕之后，遍历所有学生信息。
//
//        要求3：通过id删除学生信息
//
//        ​             如果存在，则删除，如果不存在，则提示删除失败。
//
//        要求4：删除完毕之后，遍历所有学生信息。
//
//        要求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[3];
        //学生信息录入
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student();
            System.out.printf("请输入第%d个学生的id：", i + 1);
            arr[i].setId(sc.next());
            System.out.printf("请输入第%d个学生的姓名：", i + 1);
            arr[i].setName(sc.next());
            System.out.printf("请输入第%d个学生的年龄：", i + 1);
            arr[i].setAge(sc.nextInt());
        }
        System.out.println("----- 初始学生信息 -----");
        printStudents(arr);

        //========== 要求1：添加一个学生对象，添加时进行学号唯一性判断 ==========
        System.out.println("请输入要添加学生的id：");
        String addId = sc.next();
        if (contains(arr, addId)) {
            System.out.println("该学号已存在，添加失败！");
        } else {
            Student newStudent = new Student();
            newStudent.setId(addId);
            System.out.println("请输入要添加学生的name：");
            newStudent.setName(sc.next());
            System.out.println("请输入要添加学生的age：");
            newStudent.setAge(sc.nextInt());
            //判断原数组是否存满
            if (getCount(arr) < arr.length) {
                arr[getCount(arr)] = newStudent;
            } else {
                //若已存满，则新开一个数组来存储
                Student[] newArr = creatNewArr(arr);
                newArr[newArr.length - 1] = newStudent;
                arr = newArr;
            }
            System.out.println("添加成功！");
        }

        //========== 要求2：添加完毕之后，遍历所有学生信息 ==========
        System.out.println("----- 添加后所有学生信息 -----");
        printStudents(arr);

        //========== 要求3：通过id删除学生信息，如果存在则删除，不存在则提示删除失败 ==========
        System.out.println("请输入要删除学生的id：");
        String delId = sc.next();
        int index = getIndex(arr, delId);
        if (index == -1) {
            System.out.println("删除失败：不存在该学号的学生！");
        } else {
            arr[index] = null;
            System.out.println("删除成功！");
        }

        //========== 要求4：删除完毕之后，遍历所有学生信息 ==========
        System.out.println("----- 删除后所有学生信息 -----");
        printStudents(arr);

        //========== 要求5：查询id为“heima002”的学生，存在则将年龄+1岁 ==========
        int idx = getIndex(arr, "heima002");
        if (idx == -1) {
            System.out.println("没有找到学号为 heima002 的学生");
        } else {
            arr[idx].setAge(arr[idx].getAge() + 1);
            System.out.println("已将 heima002 的年龄 +1");
        }
        System.out.println("----- 最终学生信息 -----");
        printStudents(arr);
    }

    //遍历打印所有学生信息
    public static void printStudents(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println("学号：" + arr[i].getId() + "  姓名：" + arr[i].getName() + "  年龄：" + arr[i].getAge());
            }
        }
    }

    //判断数组中是否已存在该学号，存在返回true，不存在返回false
    public static boolean contains(Student[] arr, String id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && id.equals(arr[i].getId())) {
                return true;
            }
        }
        return false;
    }

    //返回该学号所在的下标，找不到返回-1
    public static int getIndex(Student[] arr, String id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && id.equals(arr[i].getId())) {
                return i;
            }
        }
        return -1;
    }

    //统计数组中已存储的学生个数
    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    //扩容：新开一个长度+1的数组，把原数组内容拷贝过去，末尾位置留给新学生
    public static Student[] creatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
