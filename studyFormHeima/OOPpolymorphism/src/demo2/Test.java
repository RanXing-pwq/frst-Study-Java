package demo2;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("老王",30);
        Animal animal_1 = new Dog(2,"黑色");
        Animal animal_2 = new Cat();
        animal_2.setAge(3);
        animal_2.setColor("灰");
        person.keepPet();
    }
}
