package Modulo1;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        int total;
        int contaposi=0;
        int contanega=0;
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántos números?");
        total = scanner.nextInt();
        for (int i = 0; i < total; i++ ) {
            System.out.print("Siguiente número: ");
            num = scanner.nextInt();
            if (num > 0) {
                contaposi++;
            }
            if (num < 0) {
                contanega++;
            }
        }
        System.out.println("Ha habido "+contaposi+" números positivos");
        System.out.println("Ha habido "+contanega+" números negativos");
    }
}
