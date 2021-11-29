package HomeWorck.author;

import java.util.Scanner;

public class AuthorTest {

    static Scanner scanner = new Scanner(System.in);
    static AuthorStoraje authorStoraje = new AuthorStoraje();
    private static final String EXIT = "0";
    private static final String ADD_AUTHOR = "1";
    private static final String SEARCH_AUTHORS = "2";
    private static final String SEARCH_AUTHORS_BY_AGE = "3";
    private static final String PRINT_AUTHORS = "4";

    public static void main(String[] args) {
        authorStoraje.add(new Author("poxos", "poxosyan", 22, "poxos@mail.ru", "male"));
        authorStoraje.add(new Author("poxosuhi", "poxosyan", 23, "poxosuhi@mail.ru", "female"));
        authorStoraje.add(new Author("petros", "petrosyan", 24, "petros@mail.ru", "male"));
        boolean isRan = true;
        while (isRan) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case "EXIT":
                    isRan = false;
                    break;
                case "ADD_AUTHOR":
                    addAuthor();
                    break;
                case "SEARCH_AUTHORS":
                    searchByName();
                    break;
                case "SEARCH_AUTHORS_BY_AGE":
                    searchByAge();
                    break;
                case "PRINT_AUTHORS":
                    authorStoraje.print();
                    break;
                default:
                    System.out.println("invalid command!");
            }
        }
    }

    private static void searchByAge() {
        System.out.println("please input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("please input max age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStoraje.searchByAge(minAge, maxAge);
    }

    private static void printCommands() {
        System.out.println("please input " + EXIT + " for Exit");
        System.out.println("please input " + ADD_AUTHOR + " for add author");
        System.out.println("please input " + SEARCH_AUTHORS + " for search author by name");
        System.out.println("please input " + SEARCH_AUTHORS_BY_AGE + " for search author by age");
        System.out.println("please input " + PRINT_AUTHORS + " for print authors");
    }

    private static void searchByName() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        authorStoraje.searchByName(keyword);
    }

    private static void addAuthor() {
        System.out.println("please input author is name");
        String name = scanner.nextLine();
        System.out.println("please input author is surname");
        String surname = scanner.nextLine();
        System.out.println("please input author is email");
        String email = scanner.nextLine();
        System.out.println("please input author is gender");
        String gender = scanner.nextLine();
        System.out.println("please input author is age");
        int age = Integer.parseInt(scanner.nextLine());

        Author author = new Author(name, surname, age, email, gender);
        authorStoraje.add(author);
        System.out.println("Thank you. author was added");

    }
}
