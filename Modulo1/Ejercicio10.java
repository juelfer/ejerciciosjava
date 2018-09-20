package Modulo1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int altura;
        String simbolo;
        System.out.print("Símbolo: ");
        simbolo = scanner.nextLine();
        System.out.print("Altura: ");
        altura = scanner.nextInt();
        for(int i=0;i<altura;i++) {
            for(int j=0;j<altura-i;j++) {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++) {
                System.out.print(simbolo+" ");
            }
            System.out.println();
        }

    }
}


