package nowhomework;

public class ArrayCharr {
    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';
        int caunt = 0;
        // hashvel c popoxakani qanak@ masivi mej
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                caunt++;
            }
        }
        System.out.println(caunt);

        // tprl mejtexi erku simvolner@
        System.out.println(bolola[bolola.length / 2]);
        System.out.println(bolola[bolola.length / 2 + 1]);

        // tpel true ete mer masiv@ verjanum e ly-ov, ete voch false
        if (bolola[bolola.length - 2] == 'l' && bolola[bolola.length - 1] == 'y') {
            System.out.println(true);
        } else {
            System.out.println(false);

        }
    }
}
