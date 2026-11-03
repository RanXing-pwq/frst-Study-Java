public class Book {
    /*声明一个图书类，其数据成员为书名、编号（利用静态变量实现自动编号）、书价，并拥有静态数据成员册数，记录图书的总册数；
    在构造方法中，利用静态变量为对象的编号赋值，在主方法中定义对象数组，并求出总册数。*/
    private String name;
    private int Id;
    private static int counter;
    private double price;
    private static int count;

    static{
        count = 0;
        counter =0 ;
    }
    public Book() {
        count++;
        this.Id = ++counter;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
        count++;
        this.Id = ++counter;
    }

    public void toShow(){
        System.out.printf("书名：%s，书号：%d，书价：%.1f",name,Id,price);
        System.out.println();
    }
}
