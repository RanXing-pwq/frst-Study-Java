package demo1;

public class Cook extends  Employee {
    public Cook() {
    }

    public Cook(String name, int age, double salary) {
        super(name, age, salary);
    }
    @Override
    public void work() {
        System.out.println("工作(炒菜)");
    }
    @Override
    public void eat(){
        System.out.println("吃饭(吃米饭)");
    }
}
