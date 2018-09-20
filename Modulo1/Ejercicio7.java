package Modulo1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int num;
        int sumatorio = 0;
        System.out.println("¿Cuántos números? ");
        n = scanner.nextInt();
        for (int i = 0; i<n; i++ ) {
            System.out.println("Siguiente número: ");
            num = scanner.nextInt();
            sumatorio += num;
        }
        System.out.println("La media es " + (sumatorio/n));
    }
}
