package HomeWorck.arrayUtil;/*
  Տպեք կենտերի քանակը
 */

public class JavaUtil6 {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 6, 7, 8, 9, 11, 12, 75, 25};
        int count =0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 !=0){
                count++;
            }
        }
        System.out.println("Տպեք կենտերի քանակը " +count);
    }
}
