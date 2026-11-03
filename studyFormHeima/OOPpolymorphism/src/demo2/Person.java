package demo2;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public void keepPet(Animal animal,String somethind){
        System.out.println("年龄为"+this.age+"岁的"+this.name+"养了一只"+animal.getColor()+"的"+"岁的狗");
        System.out.println();
    }
}
