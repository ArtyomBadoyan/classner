/*
   Տպեք մասիվի ամենափոքրը թիվը

 */

public class ArrayUtil1 {
    public static void main(String[] args) {
        int[] myArray = {40, 10, 5, 20, 50, 6, 8, 80, 99};
        int minValue = myArray[0];

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < minValue) {
                minValue = myArray[i];
            }
        }
        System.out.println(" min value: " + minValue);
    }
}
