package nowhomework;

public class FigurAstx1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int l = 0; l < 5 - i; l++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int l = 0; l < 5 - i; l++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

            for (int s = 0; s < 4; s++) {
                for (int m = 0; m < s+2; m++) {
                    System.out.print(" ");
                }
                for (int n = 1; n < (4-s)*2; n++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
