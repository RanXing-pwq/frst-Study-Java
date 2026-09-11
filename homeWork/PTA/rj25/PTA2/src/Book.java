import java.util.Date;


/*
设计Book类，要求：
1）Book类的成员属性包括：书名name（String类型）、出版日期publishDate（Date类型）、定价price（double型）；

2）为Book对象提供按出版日期、价格排序的两种方式，且能够满足测试程序代码中的输入输出要求（注意代码注释中的说明）。

其中，类BookComparatorByPrice的排序功能是：
将一组Book对象按照价格升序排序，如果价格相同，则按照书名字母顺序排列；

类BookComparatorByPubDate的排序功能是：
将一组Book对象按照出版日期降序排序。
*/
public class Book {
    private String name;
    private Date publishDate;
    private double price;


}
