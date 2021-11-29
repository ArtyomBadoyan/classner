package ScannerExample;

import Calc.Calculator;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please input a");
        int a = scanner.nextInt();
        System.out.println("please inpot b");
        int b = scanner.nextInt();

        System.out.println("piease input operation");
        String operation = scanner.next();
        Calculator calculator = new Calculator();
        System.out.println("please in calculator");
        int c = scanner.nextInt();



    }
}
