package HomeWorck.arrayUtil;/*
  Տպեք մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)
 */

public class ArrayUtil7 {
    public static void main(String[] args) {
        int[] masiv = {5, 7, 21, 68, 25, 48, 2, 75, 87, 98};
        double sum = 0;

        for (int i = 0; i < masiv.length; i++) {
            sum += masiv[i];
        }
        System.out.println(sum);
        System.out.println(sum/masiv.length);
    }
}
