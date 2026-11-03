package demo2;

public class Cat extends Animal {
    @Override
    public void eat(String something){
        System.out.println("猫在吃东西");
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    public Cat() {
    }

    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }
}
