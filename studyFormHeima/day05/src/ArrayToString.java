public class ArrayToString {
    //可将{1,2,3}转变为[1,2,3],及将一个数组转化为字符串

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String str1 = arrToString(arr);
        System.out.println(str1);
    }

    public static String arrToString(int[] arr) {
        if (arr == null || arr.length == 0) return "";
        else {
            String str = "[";
            for (int i = 0; i < arr.length; i++) {
                if (i != arr.length - 1) {
                    str += arr[i] + ",";
                } else {
                    str += arr[i];
                }

            }
            return str + "]";
        }
    }
}