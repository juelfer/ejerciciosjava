package Modulo1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        int base;
        int exp;
        double result = 1.0;
        System.out.println("Base: ");
        Scanner scanner = new Scanner(System.in);
        base = scanner.nextInt();
        System.out.println("Potencia: ");
        exp = scanner.nextInt();
        for (int i = 0; i<exp; i++) {
            result *= base;
        }
        System.out.println("El resultado es "+result);
    }

}
