/*
   Տպեք մասիվի բոլոր զույգ էլեմենտները
 */

public class ArrayUtil3 {
    public static void main(String[] args) {
        int[] elements = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        for (int i = 0; i < elements.length; i++) {

            if(elements[i] % 2 == 0){
                System.out.println("Տպեք մասիվի բոլոր զույգ էլեմենտները : " + elements[i]);
            }
        }
    }
}
