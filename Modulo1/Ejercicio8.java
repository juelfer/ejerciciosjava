package Modulo1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número: ");
        num = scanner.nextInt();
        int fibo1 = 0;
        int fibo2 = 1;
        int aux;
        if (num==1) {
            System.out.print (fibo1);
        }
        if (num==2) {
         System.out.print( fibo1 +" "+fibo2);
        }
        if (num>2) {
           System.out.print( fibo1 +" "+fibo2);
            for (int i=0; i<(num-2); i++) {
                aux = fibo1 + fibo2;
                fibo1 = fibo2;
                fibo2 = aux;
                System.out.print(" "+fibo2);
            }
        }
    }
}
