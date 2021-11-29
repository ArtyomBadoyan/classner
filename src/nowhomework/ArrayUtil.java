package nowhomework;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] one = {2, 1, 5, 4, 8, 7, 9, 20, 65, 85, 100};

        //tpel masivi bolor elementner@
        for (int i = 0; i < one.length; i++) {
            System.out.print(one[i] + " ");

        }
        System.out.println();

        // tpel masivi amenamec element@
        int maxValue = one[0];
        for (int i = 0; i < one.length; i++) {
            if (one[i] > maxValue) {
                maxValue = one[i];
            }
        }
        System.out.println(maxValue);

        // tpel masivi amenapoqr tiv@
        int minValue = one[0];
        for (int i = 0; i < one.length; i++) {
            if (one[i] < minValue)
                minValue = one[i];

        }
        System.out.println(minValue);

        //tpel masivi zuyg elementner@
        for (int i = 0; i < one.length; i++) {
            if (one[i] % 2 == 0) {
                System.out.print(one[i] + " ");
            }
        }
        System.out.println();

        // tpel kenteri qanak@
        for (int i = 0; i < one.length; i++) {
            if (one[i] % 2 != 0) {
                System.out.print(one[i] + " ");
            }
        }
        System.out.println();

        //tpel masivi bolor tveri mijin tvabanakan@
        //elementneri gumar@ / elementneri qanakin
        double sum = 0;
        for (int i = 0; i < one.length; i++) {
            sum += one[i];

        }
        System.out.println("sum " + sum);
        System.out.println("avg " + sum / one.length);
    }
}
