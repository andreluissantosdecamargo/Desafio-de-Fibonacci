package Desafios;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o limite da sequência de Fibonacci: ");
        int limite = scanner.nextInt();

        int num1 = 0;
        int num2 = 1;
        int res;

        System.out.println(num2);

        for (int cont = 3; cont <= limite; cont++) {
            res = num1 + num2;
            System.out.println(res);
            num1 = num2;
            num2 = res;
        }

        scanner.close();
    }
}
