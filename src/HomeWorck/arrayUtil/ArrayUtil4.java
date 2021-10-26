package HomeWorck.arrayUtil;/*
  Տպեք մասիվի բոլոր կենտ էլեմենտները։
 */

public class ArrayUtil4 {
    public static void main(String[] args) {
        int[] one = {10, 5, 7, 9, 8, 25, 50, 17, 1, 98};

        for (int i = 0; i < one.length; i++) {
            if(one[i] % 2 !=0 ){
                System.out.println("Տպեք մասիվի բոլոր կենտ էլեմենտները։ " + one[i]);
            }
        }
    }
}
