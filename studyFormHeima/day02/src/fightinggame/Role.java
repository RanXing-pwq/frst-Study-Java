package fightinggame;

import java.util.Random;

public class Role {

    private String name;
    private int healthPoints;
    private char gender;
    private String face;

    Random rand = new Random();

    String[] boyfaces= {"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlfaces ={"美奂绝伦","沉鱼落雁","婷婷玉立","身材娇好","相貌平平","相貌简陋","惨不忍睹"};

    //attack 攻击描述：
    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    //injured 受伤描述：
    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };
    public Role() {
    }

    public Role(String name, int healthPoints, char gender) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.gender = gender;
        setFace(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHitPoints() {
        int hurtPoints = rand.nextInt(20)+1;
        return hurtPoints;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setFace(char gender) {

        if (gender == '男'){
            int index = rand.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        }
        else if(gender == '女'){
            int index = rand.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        }
    }

    public String getFace() {
        return face;
    }

    public void showof(){
        System.out.println("角色姓名:"+this.getName());
        System.out.println("角色血量:"+this.getHealthPoints());
        System.out.println("角色性别:"+this.getGender());
        System.out.println("角色外貌:"+this.getFace());

    }

    //this hitted role
    public void hitted(Role role) {
        int hurt = role.getHitPoints();
        this.healthPoints = this.healthPoints - hurt;
        if(this.healthPoints < 0){
            this.healthPoints = 0;
        }
        //随机攻击效果
        System.out.printf(attacks_desc[rand.nextInt(attacks_desc.length)],role.getName(),this.name);
        System.out.println();
        System.out.printf("%s对%s造成了%d的伤害,%s剩余血量为:%d\n",role.getName(),this.name,hurt,this.name,this.healthPoints);
        //System.out.printf(injureds_desc[rand.nextInt(injureds_desc.length)],this.name);

        //受伤的描述
        //血量> 90 0索引的描述
        //80 ~  90  1索引的描述
        //70 ~  80  2索引的描述
        //60 ~  70  3索引的描述
        //40 ~  60  4索引的描述
        //20 ~  40  5索引的描述
        //10 ~  20  6索引的描述
        //小于10的   7索引的描述
        if(this.healthPoints  >90){
            System.out.printf(injureds_desc[0],this.name);
        }else if(this.healthPoints >80){
            System.out.printf(injureds_desc[1],this.name);
        }else if(this.healthPoints > 70){
            System.out.printf(injureds_desc[2],this.name);
        }else if(this.healthPoints > 60){
            System.out.printf(injureds_desc[3],this.name);
        }else if(this.healthPoints > 40){
            System.out.printf(injureds_desc[4],this.name);
        }else if(this.healthPoints > 20){
            System.out.printf(injureds_desc[5],this.name);
        }else if(this.healthPoints > 10){
            System.out.printf(injureds_desc[6],this.name);
        }else {
            System.out.printf(injureds_desc[7],this.name);
        }
        System.out.println();
        System.out.println();
        if (this.healthPoints == 0) {
            System.out.printf("""
                    
                    %s KO %s!!!\n""",role.getName(),this.name);
        }
    }
}
