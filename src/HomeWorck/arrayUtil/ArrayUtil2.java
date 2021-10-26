package HomeWorck.arrayUtil;/*
  Տպեք մասիվի ամենամեծ թիվը
 */

public class ArrayUtil2 {
    public static void main(String[] args) {
        int[] numbers = { 2, 5, 9, 4, 25, 84, 96, 87, 45, 28};
        int maxNumbers = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > maxNumbers){
                maxNumbers = numbers[i];
            }

        }
        System.out.println("max numbers :" + maxNumbers);
    }
}
