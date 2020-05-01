package begin;

import java.util.Scanner;

/**
 * //TODO
 * Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль
 */
public class task1_4 {
    public static void main(String[] args) {
        System.out.println("Hello, come in first number");
        Scanner out1 = new Scanner(System.in);
        int i = out1.nextInt();
        System.out.println("Come in second number");
        Scanner out2 = new Scanner(System.in);
        int j = out2.nextInt();
        System.out.println("Введи * для умножения, + для сложения");
        Scanner res = new Scanner(System.in);
        String res1 = res.next();
        if(res1.equals("*")){
            System.out.println(i*j);
        }else if(res1.equals("+")){
            System.out.println(i+j);
        } else{
            System.out.println("Неправильно указан знак");
        }
        out1.close();
        out2.close();
        res.close();
    }
}
