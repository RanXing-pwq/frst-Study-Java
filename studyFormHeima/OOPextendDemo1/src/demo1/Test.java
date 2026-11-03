package demo1;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("zhangsan",18,19000.2,7656);
        m.eat();
        m.work();
        double bonus = m.getBonus();
        System.out.println(bonus);

        Cook c = new Cook();
        c.setAge(18);
        c.setName("lisi");
        c.setSalary(7652);
        c.eat();
        c.work();
    }
}
