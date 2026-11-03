import java.util.ArrayList;
/*
书名：Java程序设计, 书号：1, 书价：34.5
书名：数据结构, 书号：2, 书价：44.8
书名：C++程序设计, 书号：3, 书价：35.0
图书总册数为：3
*/

public class Test {
    public static void main(String[] args) {
        ArrayList<Book> List=new ArrayList<Book>();

        int count=0;

        Book book1=new Book("Java程序设计",34.5);
        Book book2=new Book("数据结构",44.8);
        Book book3=new Book("C++程序设计",35.0);
        addBook(List,book1,count);
        addBook(List,book2,count);
        addBook(List,book3,count);
        toPrint(List);
        System.out.println("图书总册数："+Book.getCount());


    }
    public static void addBook(ArrayList<Book> List, Book book, int count){
        List.add(book);
        count++;
    }
    public static void toPrint(ArrayList<Book> List){
        for(int i=0;i<List.size();i++){
            List.get(i).toShow();
        }
    }
}
