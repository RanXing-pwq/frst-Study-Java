package demo2;

public class Dog extends Animal {
    @Override
    public void eat(String something) {
        System.out.println("狗在吃东西");
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    public Dog() {
    }

    public void lookHome(){
        System.out.println("狗在看家");
    }
}
