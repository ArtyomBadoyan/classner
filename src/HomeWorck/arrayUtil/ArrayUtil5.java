package HomeWorck.arrayUtil;

/*
  Տպեք զույգերի քանակը։
 */
public class ArrayUtil5 {
    public static void main(String[] args) {
        int[] counts = {5, 10, 20, 7, 5, 6, 25, 30, 52, 24};
        int count = 0;

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] % 2 == 0) {
                count++;
            }
        }
        System.out.print("Տպեք զույգերի քանակը։ " + count);
    }
}
