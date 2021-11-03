/*
Ուղարկում եմ գործնական անելու տնայինը։
Ունենք հետևյալ մասիվը՝
1) Ունենք հետևյալ մասիվը՝
char[] bolola = {'b','o','l','o','l','a'};
ունենք նաև մի սինվոլ՝ char c = 'o';
Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
2) Ունենք հետևյալ մասիվը՝
char[] bolola = {'b','o','l','o','l','a'};
պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
3) Ունենք հետևյալ մասիվը՝՝
char[] bolola = {'b','o','l','o','l','a'};
պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
4) Ունենք հետևյալ մասիվը՝
char[] bolola = {'b','a',b','o','l','a'};
//Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
//օր․ abcbob → true, b9b -> true, բայց ասենք bac-> false
5) Ունենք հետևյալ մասիվը՝
char[] text = {' ',' ','b','a','r','e','v',' ',' '};
Տվյալ օրինակում կարող ենք կամայական քանակի պռաբելներ դնել թե սկզբից թե վերջից չկենտրոնանաք որ երկու հատ է դրված։ Պետք է գրել կոդ, որը text մասիվից կստանա char[] result մասիվ, որը կլինի նույն տեքստը, առանց պռաբելների(իրար կողք կտպի barev)։
Առայժմ այսքանը։
 */

package HomeWorck.charArray;

/*
Ունենք հետևյալ մասիվը՝
char[] bolola = {'b','o','l','o','l','a'};
ունենք նաև մի սինվոլ՝ char c = 'o';
Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
 */
public class CharArray {

    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';
        int count = 0;

        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                count++;

            }
        }
        System.out.println("coutn of " + c + " = " + count);



        /*
         Ունենք հետևյալ մասիվը՝
         char[] bolola = {'b','o','l','o','l','a'};
         պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
         */


        System.out.println(bolola[bolola.length / 2]);
        System.out.println(bolola[bolola.length / 2 - 1]);


        /*
         Ունենք հետևյալ մասիվը՝՝
         char[] bolola = {'b','o','l','o','l','a'};
         պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
         */

        if ((bolola[bolola.length - 2] == 'l') && (bolola[bolola.length - 1] == 'y')) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        /*
        Ունենք հետևյալ մասիվը՝
        char[] bolola = {'b','a',b','o','l','a'};
        //Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
        //օր․ abcbob → true, b9b -> true, բայց ասենք bac-> false
         */

        boolean isBob = false;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == 'b' && bolola[i + 2] == 'b') {
                isBob = true;
            }
        }
        System.out.println(isBob);

        /*
        Ունենք հետևյալ մասիվը՝
        char[] text = {' ',' ','b','a','r','e','v',' ',' '};
        Տվյալ օրինակում կարող ենք կամայական քանակի պռաբելներ դնել թե սկզբից թե վերջից չկենտրոնանաք
        որ երկու հատ է դրված։ Պետք է գրել կոդ, որը text մասիվից կստանա char[] result մասիվ,
        որը կլինի նույն տեքստը, առանց պռաբելների(իրար կողք կտպի barev)։
        Առայժմ այսքանը։
         */

        char[] text = {' ', ' ', 'h', 'e', 'l', 'l', 'o', ' ', 'j', 'a', 'v', 'a', ' ', ' ', ' '};
        int startIndex = 0;
        int andIndex = text.length-1;

        while (startIndex < andIndex && text[startIndex] == ' ') {
            startIndex++;
        }
        while (startIndex < andIndex && text[andIndex] == ' ') {
            andIndex--;
        }
        char[] result = new char[(andIndex - startIndex) + 1];
        int index = 0;
        for (int i = startIndex; i < andIndex; i++) {
            result[index++] = text[i];

        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

        }
    }
}

