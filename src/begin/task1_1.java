package begin;

import java.util.Scanner;

/**
 * //TODO
 * Приветствовать любого пользователя при вводе его имени через командную строку.
 */
public class task1_1 {
    public static void main(String[] args) {
        System.out.println("Hello! What is your name? ");
        Scanner out = new Scanner(System.in);
        String name = out.next();
        System.out.println("Hello "+ name);
        out.close();
    }
}
