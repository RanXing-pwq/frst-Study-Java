public class GirlFriend {
    private String name;
    private int age;
    public GirlFriend() {
        System.out.println("GirlFriend constructor");
    }
    public GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("GirlFriend constructor");
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public void sleep(){
        System.out.println("女朋友在睡觉");
    }
    public void playGame(){
        System.out.println("女朋友在玩游戏");
    }
    public void call(){
    }
//    public ~GirlFriend getGirlFriend(){
//        System.out.println("GirlFriend Over");
//    }
}
