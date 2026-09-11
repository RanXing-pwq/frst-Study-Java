public class Test1 {
    public static void main(String[] args) {
      /*  //先打印数据，再进行换行
        System.out.println("aaa");
        //只打印不换行
        System.out.print("bbb");
        System.out.print("ddd");
        //不打印任何内容，只换行
        System.out.println();
        System.out.print("cc");*/
        //设计一个方法用于数组遍历，要求遍历的结果是在一行上的。例如：[11, 22, 33, 44, 55]
        int[] arr = {1,2,3,4,5};
        printArr(arr);
    }
    //1.我要遍历数组
    //2.需要什么？  数组
    //3.调用处是否需要使用方法的结果。
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                System.out.println(arr[i] + "]");
            }else{
                System.out.print(arr[i] + ", ");
            }
        }
    }
}