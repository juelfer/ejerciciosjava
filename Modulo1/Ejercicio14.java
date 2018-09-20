package Modulo1;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        int [][] numeros = new int [5][6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<4; i++) {
            for (int j = 0; j<5; j++) {
                System.out.print("Introduzca número: ");
                int num = scanner.nextInt();
                numeros[i][j] = num;
            }
        }
        int sumafila = 0;
        int sumacolumna = 0;
        int sumatotal = 0;
        for (int i = 0; i<4; i++) {
            for (int j = 0; j<5; j++) {
                sumafila += numeros[i][j];
                if (j==4){
                    numeros[i][5]=sumafila;
                    sumafila=0;
                }
            }

        }
        for (int j = 0; j<5; j++) {
            for (int i = 0; i<4; i++) {
                sumacolumna += numeros[i][j];
                if (i==3){
                    numeros[4][j]=sumacolumna;
                    sumacolumna=0;
                }
            }
        }
        for (int j = 0; j<5; j++) {
            sumatotal += numeros[4][j];
        }
        numeros [4][5] = sumatotal;
        for (int i = 0; i<5; i++) {
            for (int j = 0; j<6; j++) {
                System.out.print(numeros[i][j]+" ");
                if (j == 5) {
                    System.out.println();
                }
            }
        }
    }
}
