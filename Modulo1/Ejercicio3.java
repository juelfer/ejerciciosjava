package Modulo1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int [10];
        int numerosreves[] = new int [10];
        for (int i = 0; i<10; i++) {
            int j = 9-i;
            numeros[i] = scanner.nextInt();
            numerosreves[j] = numeros[i];
        }
        System.out.println("Este es tu array: ");
        for (int i=0;i<10;i++) {
            System.out.println(numeros[i] +" ");
        }
        System.out.println("Y este es tu array del revés:");
        for (int i=0;i<10;i++) {
            System.out.println(numerosreves[i] + " ");
        }
    }
}
