package girlfriend;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend []arr=new GirlFriend[4];
        arr[0]=new GirlFriend("Linda",18,'女',"palygames");
        arr[1]=new GirlFriend("YiLeiNa",16,'女',"bike");
        arr[2]=new GirlFriend("Renya",20,'女',"gan");
        arr[3]=new GirlFriend("Jett",19,'女',"kongfu");
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum+=arr[i].getAge();
        }
        double avg = sum*1.0/arr.length;
        System.out.printf("平均年龄:%.2f\n",avg);

        int count=0;
        for(int j=0;j< arr.length;j++){
            if(arr[j].getAge()<avg){
                arr[j].showOfIn();
                count++;
            }
        }
        System.out.println(count);
    }

}
