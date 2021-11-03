package HomeWorck.figurPeintr;

public class FigurPeintr {

    void figurOne(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");

            }
            System.out.println();

        }
    }

    void figurTwo(int n, char l) {
        for (int i = 0; i < n; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(l + " ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(l + " ");
            }
            System.out.println();

        }
    }

    void figurThree(int n, char s) {
        for (int i = 4; i > n; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(s + " ");
            }
            System.out.println();

        }
    }

    void figurFour() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 4; j < i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void figurFive() {
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 3; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
