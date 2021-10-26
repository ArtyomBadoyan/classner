package HomeWorck.arrayUtil;

public class ArrayUtil8 {
    public static void main(String[] args) {
        int[] array = {3, 6, 7, 9, 2, 6, 13, 4, 5, 3,};

        boolean number = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                number = false;
                break;
            }
        }
        System.out.println(number);
    }
}


