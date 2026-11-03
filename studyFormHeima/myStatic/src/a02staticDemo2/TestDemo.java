package a02staticDemo2;

import static a02staticDemo2.ArrayUtil.getAerage;
import static a02staticDemo2.ArrayUtil.printArr;

public class TestDemo {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,5,6,7,8,9,10};
        String s = printArr(arr1);
        System.out.println(s);
        double[] arr2={1.2,2.4,3.3,4.5,5.7,6.9,7.198,8.86,9.376,10.9887};
        double aerage = getAerage(arr2);
        System.out.println(aerage);
    }
}
