package begin;

import java.util.Random;
import java.util.Scanner;

public class task1_3 {
    /**
     * //TODO
     * Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
     */
    public static void main(String[] args) {
        System.out.println("Укажи количество для повторения чисел ");
        Scanner out = new Scanner(System.in);
        int i = out.nextInt();
        out.close();
        Random random = new Random(i);
        for (int j = 0; j < i; j++) {
            System.out.println(random.nextInt(i));
        }

    }
}
