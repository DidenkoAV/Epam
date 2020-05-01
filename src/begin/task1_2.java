package begin;

import java.util.Scanner;

/**
 * //TODO
 * Отобразить в окне консоли аргументы командной строки в обратном порядке
 */

public class task1_2 {
    public static void main(String[] args) {
        System.out.println("Hello, tell me some words");
        Scanner out = new Scanner(System.in);
        String any = out.next();
        out.close();
        String reverse = new StringBuffer(any).reverse().toString();
        System.out.println(reverse);

        }

    }


