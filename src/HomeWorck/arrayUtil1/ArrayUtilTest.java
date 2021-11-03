package HomeWorck.arrayUtil1;

import HomeWorck.arrayUtil.ArrayUtil1;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {4, 2, 8, 7, 5, 3, 5, 2, 5, 85, 45, 69, 87};
        int[] array2 = {4, 2, 555, 7, 5, 3, 5, 2, 5, 85, 45, 69, 87};
        int arrayMax = arrayUtil.max(array);
        int array2Max = arrayUtil.max(array2);
        if (arrayMax > array2Max) {
            System.out.println("mec tiv@ array mejn e " + arrayMax);
        } else {
            System.out.println("mec tiv@ array2 mejn e " + array2Max);
        }
    }
}
